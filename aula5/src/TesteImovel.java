public class TesteImovel {
    public static void main(String[] args) {
        Propietario p1 = new Propietario(1, "Chris");
        Propietario p2 = new Propietario(2, "Rollheiser");
        Imovel imovel1 = new Imovel("Casa", "Rua Bingen", 195000, p1);
        Imovel imovel2 = new Imovel("Apto", "Rua Fonseca Ramos", 250000, p2);
    
        System.out.println(imovel1);
        System.out.println(imovel2);
    }
}
