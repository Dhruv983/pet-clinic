package com.demo.petclinic.services.springdatajpa;

import com.demo.petclinic.model.Owner;
import com.demo.petclinic.repositories.OwnerRepository;
import com.demo.petclinic.repositories.PetRepository;
import com.demo.petclinic.repositories.PetTypeRepository;
import com.demo.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.lang.management.OperatingSystemMXBean;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnersSDJpaService implements OwnerService {
    private final OwnerRepository ownerRepository;
    private final PetTypeRepository petTypeRepository;
    private final PetRepository petRepository;

    public OwnersSDJpaService(OwnerRepository ownerRepository, PetTypeRepository petTypeRepository,
                              PetRepository petRepository) {
        this.ownerRepository = ownerRepository;
        this.petTypeRepository = petTypeRepository;
        this.petRepository = petRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners= new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {

        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastname) {
        return ownerRepository.findByLastname(lastname);
    }

    @Override
    public List<Owner> findAllByLastnameLike(String lastname) {
        return null;
    }
}
