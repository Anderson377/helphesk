package com.andersondolce.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andersondolce.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
