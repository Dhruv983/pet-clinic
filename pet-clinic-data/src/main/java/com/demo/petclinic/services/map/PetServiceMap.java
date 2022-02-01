package com.demo.petclinic.services.map;

import com.demo.petclinic.model.Pet;
import com.demo.petclinic.services.CRUDService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CRUDService<Pet,Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findall();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
