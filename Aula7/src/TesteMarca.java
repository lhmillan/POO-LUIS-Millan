public class TesteMarca {
public static void main(String[] args) {
    Equipamento eq = new Equipamento(200, "iPhone 17 256GB", Marca.APPLE);

    System.out.println(eq);
    for (Marca m: Marca.values()){
        System.out.println(m);

    }
}
}
