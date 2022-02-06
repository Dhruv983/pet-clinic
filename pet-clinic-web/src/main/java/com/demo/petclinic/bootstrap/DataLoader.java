package com.demo.petclinic.bootstrap;

import com.demo.petclinic.model.Owner;
import com.demo.petclinic.model.Vet;
import com.demo.petclinic.services.OwnerService;
import com.demo.petclinic.services.VetService;
import com.demo.petclinic.services.map.OwnerServiceMap;
import com.demo.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstname("Michael");
        owner1.setLastname("Weston");
        owner1.setId(1L);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstname("Fiona");
        owner2.setLastname("Glenanne");
        owner2.setId(2L);

        ownerService.save(owner2);

        System.out.println("Loaded Owners.........");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setLastname("Axe");
        vet1.setFirstname("Sam");

        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setLastname("Porter");
        vet2.setFirstname("Jessie");

        vetService.save(vet2);

        System.out.println("Loaded Vets........");
    }
}
