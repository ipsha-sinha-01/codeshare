package com.ikea.soia.sordr

import com.fasterxml.jackson.annotation.JsonInclude
import lombok.Data
import java.util.Date
import java.util.List

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
class OrderLine {

  var metaInsertDate: Date ? = null

  var metaFilterDate: Date ? = null

  var compLineNo: Integer ? = null

  var orderLineNo: Any ? = null

  var xrefOrderNo: Any ? = null

  var xrefCompLineNo: Any ? = null

  var xrefOrderLineNo: Any ? = null

  var lineType: String ? = null

  var deliveredDate: Any ? = null

  var internalReturnDate: Any ? = null

  var deliveryMethod: Any ? = null

  var ddcFlag: Integer ? = null

  var deliveryType: Any ? = null

  var serviceProviderId: Any ? = null

  var retailPrice: Any ? = null

  var vatValue: Any ? = null

  var deliveryValue: Any ? = null

  var unitFictional: Any ? = null

  var unitShip: Any ? = null

  var xrefUnitShip: Any ? = null

  var itemId: String ? = null

  var itemQtyUom: String ? = null

  var itemQtyOrig: Float ? = null

  var itemQtyAct: Float ? = null

  var itemQtyResvStock: Float ? = null

  var itemQtyResvGit: Float ? = null

  var itemQtyResvBackord: Float ? = null

  var sywVersion: Integer ? = null

  var sywLatest: String ? = null

  var sywLatestQty: Float ? = null

  var sywLatestQtyDelta: Float ? = null

  var sywPrevious: String ? = null

  var sywPreviousQty: Float ? = null

  var sywPreviousQtyDelta: Float ? = null

  var projStatusCode: Integer ? = null

  var projStatusCodeOld: Integer ? = null

  var projStatus: String ? = null

  var statusCode: Integer ? = null

  var statusCodeOld: Integer ? = null

  var status: String ? = null

  var orderLineDetails: List<OrderLineDetail> ? = null
}
