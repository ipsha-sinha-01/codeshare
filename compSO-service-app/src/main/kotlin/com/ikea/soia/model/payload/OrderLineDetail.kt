package com.ikea.soia.sordr

import com.fasterxml.jackson.annotation.JsonInclude
import lombok.Data
import java.util.Date

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
class OrderLineDetail {

  var metaInsertDate: Date ?  =null

  var metaFilterDate: Date ?  =null

  var detailLineNo: java.lang.Integer ?  =null

  var detailType: String ?  =null

  var cduId: Any ?  =null

  var cduCsmState: Any ?  =null

  var csmlId: Any ?  =null

  var unitCnor: Any ?  =null

  var unitDsp: Any ?  =null

  var unitCnee: Any ?  =null

  var unitSup: Any ?  =null

  var xrefCsmlId: Any ?  =null

  var xrefCduId: Any ?  =null

  var itemQty: Any ?  =null

  var loadedAtCuDate: Any ?  =null

  var dispatchedDate: Any ?  =null

  var receivedAtHubDate: Any ?  =null

  var receivedAtHubDate1: Any ?  =null

  var loadedOnTruckDate: Any ?  =null

  var loadedOnTruckDate1: Any ?  =null

  var availableForPupDate: Any ?  =null

  var availableForPupDate1: Any ?  =null

  var deliveredDate: Any ?  =null

  var missingDate: Any ?  =null

  var damagedDate: Any ?  =null

  var deliveryFailureDate: Any ?  =null

  var deliveryRefusedDate: Any ?  =null

  var internalReturnDate: Any ?  =null

  var projStatusCode: java.lang.Integer ?  =null

  var projStatusCodeOld: java.lang.Integer ?  =null

  var projStatus: String ?  =null

  var statusCode: java.lang.Integer ?  =null

  var statusCodeOld: java.lang.Integer ?  =null

  var status: String ?  =null
}
