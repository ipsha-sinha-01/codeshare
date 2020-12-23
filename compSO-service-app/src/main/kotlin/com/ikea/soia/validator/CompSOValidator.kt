package com.ikea.soia.validator

import com.fasterxml.jackson.databind.JsonNode
import com.ikea.soia.exception.ApiErrorSchema
import com.ikea.soia.exception.PayloadValidationErrorSchema
import com.networknt.schema.JsonSchemaFactory
import com.networknt.schema.SpecVersion
import com.networknt.schema.ValidationMessage
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.io.InputStream
import javax.validation.Validator

/**
 * This service class enriches data into the Consignment object and calls repository to persist/merge the consignment
 */
@Service
class CompSOValidator {

    @Autowired
    val validator: Validator ?= null

    private val logger = KotlinLogging.logger {}


    @Value("\${errorhandler.api.url}")
    val  errorHandlerUrl : String? = null


    @Throws(Exception::class)
    fun validateInputUsingJsonSchema(json: JsonNode?, startTime : Long): Boolean {
        val schemaFactory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V201909)
        val schemaStream = inputStreamFromClasspath("compSO-schema.json")
        val schema = schemaFactory.getSchema(schemaStream)
        val validationResult = schema.validate(json)

        return if (validationResult.isEmpty()) {
            logger.debug("no validation errors")
            true
        } else {
            val errors: MutableList<PayloadValidationErrorSchema> = ArrayList()
            logger.debug("validationResult size "+validationResult.size)

            validationResult.forEach { vm: ValidationMessage ->
                var payloadValidationError = PayloadValidationErrorSchema(vm.message.trim { it <= ' ' }.split(":").toTypedArray()[0].trim(), vm.message.trim { it <= ' ' }.split(":").toTypedArray()[1].trim())
                errors.add(payloadValidationError)

            }
            var execTimeApi = startTime.let { System.currentTimeMillis().minus(it) }
            val apiError = ApiErrorSchema("payloadValidation",execTimeApi, HttpStatus.BAD_REQUEST, errors, json,
                    null,null, "Order","Order",null,null,
                    "CompSO-service",null)
             handleError(apiError)
            false

            }
    }

    private fun inputStreamFromClasspath(path: String): InputStream {
        return Thread.currentThread().contextClassLoader.getResourceAsStream(path)
    }

    fun handleError(apiError: ApiErrorSchema){
        logger.info("Calling error handler service :$errorHandlerUrl")
        try {
            RestTemplate().postForEntity<String>(errorHandlerUrl, apiError, String::class.java)
        }catch( e: Exception){
            logger.error("Exception while sending error :$apiError to Error Handler API :${e.stackTrace}")
            throw e;
        }
    }
}