package com.pedro.Lombok.PrjLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.Lombok.PrjLombok.entities.Usuario;

public interface UsuarioRepoitorio extends JpaRepository<Usuario, Long>{

}
