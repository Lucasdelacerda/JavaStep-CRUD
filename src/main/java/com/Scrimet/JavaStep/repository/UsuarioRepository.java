package com.Scrimet.JavaStep.repository;

import com.Scrimet.JavaStep.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String Email);
    Optional<Usuario> findByNome(String nome);
    @Transactional
    void deleteByEmail(String email);
}