package com.ikea.soia.sordr

import com.fasterxml.jackson.annotation.JsonInclude
import lombok.Data
import java.util.Date

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

class Order {

  var metaInsertDate: Date? = null

  var metaFilterDate: Date? = null

  var event: String? = null

  var msgSource: String? = null

  var orderType: String? = null

  var orderSubType: Any? = null

  var orderNo: String? = null

  var zipCode: Any? = null

  var entryType: Any? = null

  var createDate: Any? = null

  var deliveredDate: Any? = null

  var gaSell: String? = null

  var unitSell: String? = null

  var originalTotalAmount: Any? = null

  var currencyCode: Any? = null

  var vatValue: Any? = null

  var deliveryValue: Any? = null

  var serviceType: Any? = null

  var paymentMethod: Any? = null

  var paymentStatus: Any? = null

  var projStatusCode: Integer? = null

  var projStatusCodeOld: Integer? = null

  var projStatus: String? = null

  var statusCode: Integer? = null

  var statusCodeOld: Integer? = null

  var status: String? = null

  var workOrders: List<WorkOrder>? = null

  var orderLines: List<OrderLine>? = null

}
