package com.demo.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "vets")
public class Vet extends Person{

    @Builder
    public Vet(Long id, String firstname, String lastname, Set<Speciality> specialities) {
        super(id, firstname, lastname);
        this.specialities = specialities;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

}
