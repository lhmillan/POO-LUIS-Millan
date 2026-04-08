public class TesteMedico {
    public static void main(String[] args) {
        Medico medico1 = new Medico(1234,"Adriano",200);
        Medico medico2 = new Medico(124,"Carla",400);
        Medico medico3 = new Medico(234,"Carlos",260);
        Medico medico4 = new Medico(616, "Stephen Estranho", 2500);

        System.out.println("Total de médicos cadastrados: "+Medico.getTotalMed());
        System.out.println(medico1.getNome());
        System.out.println(medico2.getNome());
        System.out.println(medico3.getNome());
        System.out.println(medico4.getNome());
    }
}
