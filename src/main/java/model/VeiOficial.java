package model;

import javax.persistence.*;

@Entity
@Table(name = "tb_veioficial")
public class VeiOficial extends Veiculo {
    private String renavan;
    private String chassi;

    public String getRenavan() {
        return this.renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getChassi() {
        return this.chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
}
