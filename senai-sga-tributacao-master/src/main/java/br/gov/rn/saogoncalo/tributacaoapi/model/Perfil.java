package br.gov.rn.saogoncalo.tributacaoapi.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "perfis")
public class Perfil implements GrantedAuthority {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Override
    public String getAuthority() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perfil perfil = (Perfil) o;
        return id.equals(perfil.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
