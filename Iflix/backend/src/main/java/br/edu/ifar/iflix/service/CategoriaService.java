package br.edu.ifar.iflix.service;

import br.edu.ifar.iflix.model.Categoria;
import br.edu.ifar.iflix.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriaService {

    private CategoriaRepository repo;

    public CategoriaService(CategoriaRepository r){
        this.repo = r;
    }

    // listar todas categoria
    public List<Categoria> buscarTodos(){
        return this.repo.findAll();
    }
    public void gravar(Categoria c){
        this.repo.save(c);
    }
}
