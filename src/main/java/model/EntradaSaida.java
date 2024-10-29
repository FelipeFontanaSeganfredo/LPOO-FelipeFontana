package model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "tb_entradasaida")
public class EntradaSaida {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    
    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipoMovimentacao;

    @ManyToOne
    @JoinColumn(name = "veiculo_id", nullable = false)
    private final Veiculo veiculo;

    public EntradaSaida(TipoMovimentacao tipo, Veiculo veiculo) {
        tipoMovimentacao = tipo;
        this.veiculo = veiculo;
        data = new Date();
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return this.tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }
}


