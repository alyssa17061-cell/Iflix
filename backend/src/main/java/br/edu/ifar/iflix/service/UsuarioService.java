package br.edu.ifar.iflix.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import br.edu.ifar.iflix.model.Usuario;
import br.edu.ifar.iflix.repository.UsuarioRepository;

@Service 
public class UsuarioService {
    private UsuarioRepository repo;

    public UsuarioService(UsuarioRepository r){
         this.repo = r;
    }
    
    // listar todas usuarios
    public List<Usuario> buscarTodos(){
        return this.repo.findAll(Sort.by(Order.asc("nome"))  );
    }
     
    public void gravar(Usuario u){
        this.repo.save(u);
    }

    public Usuario buscaPorId(int id){
        return this.repo.findById(id)
        .orElseThrow( () ->  new  ResponseStatusException(
            HttpStatus.NOT_FOUND, "Usuário não encontrado"
        ) ) ;
    }
     public void remover(int id) {
        Usuario usuario = buscaPorId(id);
        repo.delete(usuario);
    }
}
