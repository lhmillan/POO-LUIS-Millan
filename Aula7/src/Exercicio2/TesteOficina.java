package Exercicio2;

import java.time.LocalDate;

public class TesteOficina {
    public static void main(String[] args) {

        Propietario p1 = new Propietario("Luis");
        Propietario p2 = new Propietario("Kratos de Sparda");
        Propietario p3 = new Propietario("Carol");
        Carro c1 = new Carro("Civic", LocalDate.of(2026, 8, 8), p1, "Sedã");
        Carro c2 = new Carro("Kombi Véia", LocalDate.now(), p2, "Van");
        Moto m1 = new Moto("Ducati",LocalDate.now() , p1);
        Moto m2 = new Moto("Royal Enfield", LocalDate.of(2025, 7, 27), p1);

        //c1.trocarOleo();//teste num sábado para pegar o desconto
        //c2.trocarOleo();//teste dia aleatório
        //c1.lavarVeiculo();
        //c1.revisao();
        c1.lavarVeiculo();
        m1.lavarVeiculo();
        m2.revisao();
        m2.trocarOleo();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(m1);
        System.out.println(m2);
        
    
    }

}
