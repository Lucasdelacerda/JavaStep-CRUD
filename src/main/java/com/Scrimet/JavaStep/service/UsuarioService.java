package com.Scrimet.JavaStep.service;

import com.Scrimet.JavaStep.entitys.Usuario;
import com.Scrimet.JavaStep.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario) {
        String senhaPura = usuario.getPassword();
        String hash = encoder.encode(senhaPura);

        usuario.setPassword(hash);
        repository.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email) {
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
    }



    public void deletarUsuarioPorId(String id) {
        if (!repository.existsById(id)){
            throw new RuntimeException("Usuário não encontrado" + id);
        }
        repository.deleteById(id);
    }

    public void atualizarUsuarioPorId(String id, Usuario usuario) {
        Usuario usuarioEntity = repository.findById(id).orElseThrow(() ->
                new RuntimeException("usuário não encontrado"));
        Usuario usuarioAtualizado = Usuario.builder()
                //sistema para ver se o usuário já se cadastro, quando quer adicionar algo nessa lista basta repetir novamente
                .email(usuario.getEmail() != null ? usuario.getEmail() : usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ? usuario.getNome() : usuarioEntity.getNome())
                .id(usuarioEntity.getId())
                .build();
        repository.saveAndFlush(usuarioAtualizado);
    }
}
