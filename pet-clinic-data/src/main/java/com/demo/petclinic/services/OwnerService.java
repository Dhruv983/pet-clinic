package com.demo.petclinic.services;

import com.demo.petclinic.model.Owner;



public interface OwnerService extends CRUDService<Owner,Long> {
    Owner findByLastName(String lastname);

}
