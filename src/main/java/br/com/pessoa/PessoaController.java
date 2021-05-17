package br.com.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @GetMapping("/{id}")
    public PessoaEntity recuperarPorId(@PathVariable Long id){

        return service.recuperarPorId(id);

    }

    @GetMapping
    public List<PessoaEntity> recuperarTodos(){
        return service.recuperarTodos();
    }

    @PostMapping
    public void cadastrar(@RequestBody PessoaDTO pessoa){
        service.cadastrar(pessoa);

    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable Long id,@RequestBody PessoaDTO pessoa){
        service.alterar(id, pessoa);
    }
}
