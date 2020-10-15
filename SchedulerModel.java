package com.ikea.soia.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class represents the Event entity mapped to database Table "Event"
 */

@Entity
@Table(name="scheduler")
@Setter
@Getter
public class SchedulerModel {


    @Id
    public Integer id;


    public Integer value;



}