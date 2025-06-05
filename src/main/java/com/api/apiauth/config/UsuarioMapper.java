package com.api.apiauth.config;

import org.springframework.stereotype.Component;

import com.api.apiauth.dto.UsuarioDTO;
import com.api.apiauth.models.Usuario;
@Component
public class UsuarioMapper {
    
    public UsuarioDTO usuarioToDto(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setIdUsuario(usuario.getIdUsuario());
        dto.setNombreUsuario(usuario.getNombreUsuario());
        dto.setEmail(usuario.getEmail());
        dto.setRol(usuario.getRol());
        dto.setEstado(usuario.getEstado());
        return dto;
    }
}
