package com.api.apipsql.service;

import java.util.List;
import java.util.Optional;

import com.api.apipsql.models.Persona;
import com.api.apipsql.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona create (Persona persona) {
        return personaRepository.save(persona);
    }
    public List<Persona> getAllPersonas(){
        return personaRepository.findAll();
    }

    public void delete (Persona persona) {
        personaRepository.delete(persona);
    }

    public Optional<Persona> findById (Long id) {
        return personaRepository.findById(id);
    }

}