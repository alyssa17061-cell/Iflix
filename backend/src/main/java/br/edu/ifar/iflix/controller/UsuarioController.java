package br.edu.ifar.iflix.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifar.iflix.model.Usuario;
import br.edu.ifar.iflix.service.UsuarioService;

@RestController
@RequestMapping( "/usuario")
public class UsuarioController {
     private UsuarioService service;

    public UsuarioController( UsuarioService s ) {
        this.service = s;
    }
    @GetMapping("/{id}") 
    public Usuario buscaPorId( @PathVariable int id ){
        return this.service.buscaPorId(id);
    }

    @GetMapping
    public List<Usuario> buscarTodos(){
        return this.service.buscarTodos();
    }
    @PostMapping
    public Usuario gravar( @RequestBody Usuario usu){
        this.service.gravar(usu);
        return usu;
        
    }
    @PutMapping 
    public Usuario atualizar( @RequestBody Usuario usu){
        this.service.gravar(usu);
        return usu;
        
    }
    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id) {
        service.remover(id);
    }
}
