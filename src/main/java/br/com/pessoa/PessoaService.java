package br.com.pessoa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public void cadastrar(PessoaDTO pessoa){

        PessoaEntity entity = new PessoaEntity();


        entity.setNome(pessoa.getNome());

        repository.save(entity);

    }

    public PessoaEntity recuperarPorId(long id){
        PessoaEntity entity = repository.findById(id).get();

        return entity;
    }

    public List<PessoaEntity> recuperarTodos(){
        List<PessoaEntity> lista = repository.findAll();

        return lista;
    }


    public void deletar(Long id){
        repository.deleteById(id);
    }

    public void alterar(Long id, PessoaDTO pessoa){
        PessoaEntity entity = repository.findById(id).get();

        entity.setNome(pessoa.getNome());

        repository.save(entity);
    }
}
