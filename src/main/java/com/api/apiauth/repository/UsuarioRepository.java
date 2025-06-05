package com.api.apiauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.apiauth.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {


}
