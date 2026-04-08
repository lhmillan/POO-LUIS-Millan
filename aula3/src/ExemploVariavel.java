public class ExemploVariavel {
    public static void main(String[] args) {
        int a=1;//variavel GLOBAL

        if (a==0) {
            int b = 1; //variavel LOCAL
            System.out.println(a);
        }
    }
}
