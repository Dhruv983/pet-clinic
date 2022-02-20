package com.demo.petclinic.services.map;

import com.demo.petclinic.model.Speciality;
import com.demo.petclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile("map")
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);

    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
