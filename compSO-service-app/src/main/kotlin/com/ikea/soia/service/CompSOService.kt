package com.ikea.soia.service

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.ikea.soia.exception.ApiErrorSchema
import com.ikea.soia.repository.CompSORepository
import com.ikea.soia.validator.CompSOValidator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompSOService {
    @Autowired
    private val repo: CompSORepository? = null

    fun processRequest(jsonNode: JsonNode) {
        val isValid = validationHandler?.validateInputUsingJsonSchema(jsonNode, System.currentTimeMillis())
        if(null != isValid && isValid ) createCompSO(jsonNode?.toString())
    }

    @Autowired
    val validationHandler: CompSOValidator? = null

    fun createCompSO (request: String?){
        repo?.createCompSO(request)
    }

}