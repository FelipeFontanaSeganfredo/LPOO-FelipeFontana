package model;

import javax.persistence.*;

@Entity
@Table(name = "tb_esoficial")
public class ESOficial extends EntradaSaida {
    private int kmRegistrado;

    @ManyToOne
    @JoinColumn(name = "motorista_id", nullable = false)
    private Pessoa motorista;

    public ESOficial(TipoMovimentacao tipo, Veiculo veiculo, Pessoa motorista) {
        super(tipo, veiculo);
        this.motorista = motorista;
    }


    public int getKmRegistrado() {
        return this.kmRegistrado;
    }

    public void setKmRegistrado(int kmRegistrado) {
        this.kmRegistrado = kmRegistrado;
    }

    public Pessoa getMotorista() {
        return this.motorista;
    }

    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }
    
}
