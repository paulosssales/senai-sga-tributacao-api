package br.gov.rn.saogoncalo.tributacaoapi.repository;

import br.gov.rn.saogoncalo.tributacaoapi.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
