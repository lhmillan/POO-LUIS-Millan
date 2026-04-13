 public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("J.K Rowling", "Harry Potter - O Cálice de Fogo", 85);
        Livro livro2 = new Livro("Eduardo Spohr", "Batalha do Apocalipse", 98); 
    
        Operacao o1 = new Operacao("Venda", livro1);
        Operacao o2 = new Operacao("Empréstimo",livro2);

        
        livro1.reajuste(6);

        o1.venderLivro();
        
       
        o2.emprestarLivro();
        System.out.println(o1);
        System.out.println(o2);
    }
}
