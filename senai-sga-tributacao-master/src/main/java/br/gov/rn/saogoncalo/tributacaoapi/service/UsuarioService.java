package br.gov.rn.saogoncalo.tributacaoapi.service;

import br.gov.rn.saogoncalo.tributacaoapi.model.Usuario;
import br.gov.rn.saogoncalo.tributacaoapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String matricula) throws UsernameNotFoundException {
        Optional<Usuario> usuario = repository.findByMatricula(matricula);
        if (usuario.isPresent()){
            return usuario.get();
        }
        throw new UsernameNotFoundException("Usuario ou Senha inválidos");
    }

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
