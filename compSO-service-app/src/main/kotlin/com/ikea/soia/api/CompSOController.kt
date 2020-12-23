package com.ikea.soia.api

import com.fasterxml.jackson.databind.JsonNode
import com.ikea.soia.service.CompSOService
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.context.WebApplicationContext
import javax.validation.Valid

@RestController
@EnableAutoConfiguration
@RequestMapping(path = ["/compso"])
class CompSOController {
    private val logger = KotlinLogging.logger{}

    @Autowired
    private var service: CompSOService? = null

    @Autowired
    private var context  :  WebApplicationContext? = null


    @PostMapping(produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    @Throws(Exception::class)
    fun createCompSO(@Valid @RequestBody request:  JsonNode): Any {
        service?.processRequest(request)
        return "ok"
    }
}
