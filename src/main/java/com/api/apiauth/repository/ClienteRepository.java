package com.api.apiauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.apiauth.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    

}
