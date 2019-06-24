package br.gov.rn.saogoncalo.tributacaoapi.controller;

import br.gov.rn.saogoncalo.tributacaoapi.model.Usuario;
import br.gov.rn.saogoncalo.tributacaoapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> buscaTodos() {
        return service.buscaTodos();
    }

}
