package br.gov.rn.saogoncalo.tributacaoapi.service;

import br.gov.rn.saogoncalo.tributacaoapi.model.Usuario;
import br.gov.rn.saogoncalo.tributacaoapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> buscaTodos() {
        return repository.findAll();
    }

    public Usuario salva(Usuario usuario) {
        return repository.save(usuario);
    }

    public Optional<Usuario> buscaPorId(Long id) {
        return repository.findById(id);
    }

    public void removePorId(Long id) {
        repository.deleteById(id);
    }

}
