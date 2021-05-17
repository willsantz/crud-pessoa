package br.com.pessoa;


import javax.persistence.*;

@Table(name = "TB.PESSOA")
@Entity
public class PessoaEntity {

    @Id
    @Column(name = "ID_PESSOA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
