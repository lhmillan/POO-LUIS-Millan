package Exercicio2;

import java.time.LocalDate;

public class Veiculo {
    protected String modelo;
    protected double valorCobrado;
    protected LocalDate dataConserto;
    protected Propietario Propietario;
    
    public Veiculo(String modelo, LocalDate dataConserto, Exercicio2.Propietario propietario) {
        this.modelo = modelo;
        this.dataConserto = dataConserto;
        Propietario = propietario;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Valor cobrado: " + valorCobrado + ", Data conserto: " + dataConserto
                + ", Propietario: " + Propietario.nome;
    }

    public Double getValorCobrado() {
        return valorCobrado;
    }


}
