package com.matheusclemente.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusclemente.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
