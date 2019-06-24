package br.gov.rn.saogoncalo.tributacaoapi.repository;

import br.gov.rn.saogoncalo.tributacaoapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByMatricula(String matricula);

    Optional<Usuario> findByEmail(String email);

}
