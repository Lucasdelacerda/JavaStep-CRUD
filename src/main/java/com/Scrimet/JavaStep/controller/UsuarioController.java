package com.Scrimet.JavaStep.controller;

import com.Scrimet.JavaStep.service.UsuarioService;
import com.Scrimet.JavaStep.entitys.Usuario;
import com.Scrimet.JavaStep.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;
    @Autowired
    private final UsuarioRepository repository;

    @PostMapping
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }
@GetMapping
public List<Usuario> listarTodos(){
        return repository.findAll();
}

    @GetMapping("/email/{email}")
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<Usuario> bucarUsuarioPorNome(@PathVariable String nome){
        return ResponseEntity.ok(usuarioService.bucarUsuarioPorNome(nome));
    }
    @DeleteMapping("/email/{email}")
    public ResponseEntity<Void> deletarUsuarioPorEmail(@PathVariable String email) {
        usuarioService.deletarUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/id/{id}")
    public ResponseEntity<Void> atualizarUsuarioPorId(@PathVariable Integer id, @RequestBody Usuario usuario) {
        usuarioService.atualizarUsuarioPorId(id, usuario);
        return ResponseEntity.ok().build();
    }
}
