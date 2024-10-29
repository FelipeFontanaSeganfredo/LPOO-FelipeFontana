package model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String nome;
    private String fone;
    private String email;

    @Enumerated(EnumType.STRING)
    private VinculoPessoa vinculoPessoa;

    // Comentar ManyToMany conforme orientação
    // @OneToMany(mappedBy = "pessoa")
    // private List<Veiculo> listaVeiculos;

    public Pessoa() {
        listaVeiculos = new ArrayList<>();
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return this.fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public VinculoPessoa getVinculoPessoa() {
        return this.vinculoPessoa;
    }

    public void setVinculoPessoa(VinculoPessoa vinculoPessoa) {
        this.vinculoPessoa = vinculoPessoa;
    }
    
}
