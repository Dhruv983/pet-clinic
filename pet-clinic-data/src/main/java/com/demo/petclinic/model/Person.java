package com.demo.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class Person extends BaseEntity{

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastname;


}
