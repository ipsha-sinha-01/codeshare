

package com.ikea.soia.repository;

import com.ikea.soia.model.entity.Consignment;
import com.ikea.soia.model.entity.SchedulerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SchedulerRepository extends JpaRepository<SchedulerModel, Integer>, JpaSpecificationExecutor<SchedulerModel> {
  //  List<Consignment> findByCodeTypeCSMId(@Param("businessUnitCodeCreate") String businessUnitCodeCreate, @Param("businessUnitTypeCreate") String businessUnitTypeCreate, @Param("idNumber") String idNumber);

}

