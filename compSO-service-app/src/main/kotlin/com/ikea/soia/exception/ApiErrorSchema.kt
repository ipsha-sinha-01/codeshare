package com.ikea.soia.exception

import com.fasterxml.jackson.databind.JsonNode
import org.springframework.http.HttpStatus


class ApiErrorSchema (

     var errorMsg : String,
     var execTimeApi:Long? = null,
     var status: HttpStatus? = null,
     var errorPayload: MutableList<PayloadValidationErrorSchema>? = null,
     var msgPayload : JsonNode? = null,
     var msgXtndInfo: String ?= null,
     var inboundPkg: String ?= null,
     var srcEntity: String ?= null,
     var targEntity: String ?= null,
     var keyName: String ?= null,
     var keyVal: String ?= null,
     var srcSystem: String ?= null,
     var connection: String ?= null
)