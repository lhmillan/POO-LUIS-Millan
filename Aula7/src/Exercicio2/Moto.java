package Exercicio2;

import java.time.LocalDate;

public class Moto extends Veiculo implements Oficina {

    int cilindradas;

    public Moto(String modelo, LocalDate dataConserto, Exercicio2.Propietario propietario) {
        super(modelo, dataConserto, propietario);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double lavarVeiculo() {
        return valorCobrado = TipoServico.LAVAGEM.getValorPorServico();
    }

    @Override
    public double trocarOleo() {
        return valorCobrado = TipoServico.OLEO.getValorPorServico();
    }

    @Override
    public double revisao() {
        return valorCobrado = TipoServico.REVISAO.getValorPorServico();
    }

}
