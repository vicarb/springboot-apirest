package com.api.apipsql.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.api.apipsql.models.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}