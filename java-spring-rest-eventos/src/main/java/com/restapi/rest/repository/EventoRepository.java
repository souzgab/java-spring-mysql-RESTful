package com.restapi.rest.repository;

import com.restapi.rest.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, String>{
    
}
