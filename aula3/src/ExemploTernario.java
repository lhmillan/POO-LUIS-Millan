public class ExemploTernario {
    public static void main(String[] args) {
        boolean concluida = true;
        int media = 6;

        if (concluida) {
            System.out.println("Tarefa concluída com sucesso!");
        } else {
            System.out.println("Tarefa não concluida");
        }

        // System.out.println(concluida ? "Tarefa concluída com sucesso!" : "Tarefa não
        // concluída!");
        // Média < 5 - Ruim | Menor que 9 - Bom | Maior ou igual a 9 - Ótimo
        
        System.out.println(media < 5 ? "Ruim" : media < 9 ? "Bom" : "Ótimo");

    }
}
