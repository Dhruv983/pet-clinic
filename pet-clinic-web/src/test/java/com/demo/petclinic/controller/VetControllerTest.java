package com.demo.petclinic.controller;

import com.demo.petclinic.model.Vet;
import com.demo.petclinic.services.VetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.Mockito.when;



import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class VetControllerTest {
    @Mock
    VetService vetService;

    @InjectMocks
    VetController controller;

    Set<Vet> vet;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        vet = new HashSet<>();
        vet.add(Vet.builder().id(1l).build());
        vet.add(Vet.builder().id(2l).build());

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void listVets() throws Exception{
        when(vetService.findAll()).thenReturn(vet);

        mockMvc.perform(get("/vets")).andExpect(status().isOk())
                .andExpect(view().name("vets/index"))
                .andExpect(model().attribute("vets", hasSize(2)));
    }
}