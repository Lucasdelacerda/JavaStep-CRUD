package com.Scrimet.JavaStep.entitys;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
@Builder
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "email", unique = true)
    @Email(message = "Insira email válido")
    private String email;

    @Column(name = "nome")
    private String nome;

    @Column(name="password")
    @Pattern(
            regexp = "^(?=.*[A-Z])(?=.*[!@#$%^&(),.?:{}|<>]).{6,}$",
    message = "A senha deve ter no mínimo 6 caracteres, pelo menos uma letra maiúscula e um caractere especial (!@#$%^&...)"
            )
    private String password;


}

