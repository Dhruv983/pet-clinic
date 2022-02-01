package com.demo.petclinic.services.map;

import com.demo.petclinic.model.Owner;
import com.demo.petclinic.services.CRUDService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CRUDService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
