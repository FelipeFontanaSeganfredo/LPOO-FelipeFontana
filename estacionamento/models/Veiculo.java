public class Veiculo {
    
}
package models;

import enums.TipoVeiculo;
import enums.Marca;

public class Veiculo {
    private String placa;
    private String cor;
    private Modelo modelo;
    private TipoVeiculo tipoVeiculo;
    private VeiOficial veiculoOficial;

    public Veiculo(String placa, String cor, Modelo modelo, TipoVeiculo tipoVeiculo, VeiOficial veiculoOficial) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.tipoVeiculo = tipoVeiculo;
        this.veiculoOficial = veiculoOficial;
    }

    
}
