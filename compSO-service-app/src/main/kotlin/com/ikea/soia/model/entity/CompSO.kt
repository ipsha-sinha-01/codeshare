package com.ikea.soia.model.entity

import java.io.Serializable
import java.time.OffsetDateTime
import javax.persistence.*


@Entity(name = "order_json")

open class CompSO : Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    var id: Long? = null

    @Column(name="request")
    var request: String? = null



}