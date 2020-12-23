package com.ikea.soia.repository

import com.ikea.soia.model.entity.CompSO
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param



interface CompSORepository :  JpaRepository<CompSO?, Int?>, JpaSpecificationExecutor<CompSO?> {

    @Query(value = "SELECT INSERT_JSON_REQUEST_fn(:request);", nativeQuery = true)
    fun createCompSO(@Param("request") request: String?) : String

}