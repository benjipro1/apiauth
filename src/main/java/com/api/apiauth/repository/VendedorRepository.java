package com.api.apiauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.apiauth.models.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

}
