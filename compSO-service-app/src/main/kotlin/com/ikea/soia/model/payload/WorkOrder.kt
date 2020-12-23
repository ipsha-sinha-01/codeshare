package com.ikea.soia.sordr

import com.fasterxml.jackson.annotation.JsonInclude
import lombok.Data
import java.util.Date
import java.util.List

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
class WorkOrder {

  var metaInsertDate: Date ? = null

  var metaFilterDate: Date ? = null

  var workOrderNo: String ? = null

  var promisedDelivStart: Any ? = null

  var promisedDelivEnd: Any ? = null

  var deliveredDate: Any ? = null

  var vatValue: Any ? = null

  var deliveryValue: Any ? = null

  var unitMerge: String ? = null

  var projStatusCode: java.lang.Integer ? = null

  var projStatusCodeOld: java.lang.Integer ? = null

  var projStatus: String ? = null

  var statusCode: java.lang.Integer ? = null

  var statusCodeOld: java.lang.Integer ? = null

  var status: String ? = null

  var orderLines: List<OrderLine>? = null
}
