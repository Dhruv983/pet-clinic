package com.demo.petclinic.repositories;

import com.demo.petclinic.model.Owner;
import com.demo.petclinic.services.CRUDService;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    Owner findByLastname(String lastname);
    public List<Owner> findAllByLastnameLike(String lastname);
}
