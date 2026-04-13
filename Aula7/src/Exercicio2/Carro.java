package Exercicio2;

import java.time.LocalDate;

public class Carro extends Veiculo implements Oficina{
    String categoria;

    public Carro(String modelo, LocalDate dataConserto, Propietario propietario, String categoria) {
        super(modelo, dataConserto, propietario);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
    

    @Override
    public double lavarVeiculo() {
        valorCobrado = valorCobrado + 50;
        return valorCobrado;    
    }

    @Override
    public double trocarOleo() {
        if(dataConserto.getDayOfWeek().name().equals("SATURDAY")){
            valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico() - 50;
            return valorCobrado;
        }else {
            valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
            return valorCobrado;
        }
          }

    @Override
    public double revisao() {
        if(dataConserto.getMonth().name().equals("AUGUST")){
            valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico() - TipoServico.REVISAO.getValorPorServico() *0.1;
            return valorCobrado;
        }else{
            valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
            return valorCobrado;
        }

    }



    
}
