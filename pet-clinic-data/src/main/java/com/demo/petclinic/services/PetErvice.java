package com.demo.petclinic.services;


import com.demo.petclinic.model.Pet;

import java.util.Set;

public interface PetErvice {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
