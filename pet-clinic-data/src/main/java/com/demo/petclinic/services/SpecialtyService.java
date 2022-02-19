package com.demo.petclinic.services;

import com.demo.petclinic.model.Speciality;
import org.springframework.stereotype.Service;

@Service
public interface SpecialtyService extends CRUDService<Speciality,Long> {
}
