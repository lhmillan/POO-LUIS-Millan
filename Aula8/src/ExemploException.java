public class ExemploException {
    public static void main(String[] args) {
try {
    System.out.println("Resultado -> " + calcular(10, 0));
    
} catch (ArithmeticException e) {
    System.out.println("Divisão por zero!");
}finally{//sempre é excutado independente de acerto ou erro
    System.out.println("Fim de programa no finally!");
}
    }

    public static int calcular(int a, int b) {
        if (b == 0) {
                //throw new ArithmeticException("Divisão por zero!");
        } 
            return a / b;
        }
    }

