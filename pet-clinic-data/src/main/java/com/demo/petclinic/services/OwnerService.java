package com.demo.petclinic.services;

import com.demo.petclinic.model.Owner;

import java.util.List;


public interface OwnerService extends CRUDService<Owner,Long> {
    Owner findByLastName(String lastname);
    List<Owner> findAllByLastnameLike(String lastname);

}
