import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploThrows {
    public static void main(String[] args) throws FileNotFoundException{ 
      FileReader leitura = new FileReader("Teste.txt");
        /*  try{
            FileReader leitura = new FileReader("\\teste.txt"); 
            System.out.println("Arquivo encontrado.");
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado.");
        }*/
       
    }
    
}
