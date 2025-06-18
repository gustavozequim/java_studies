public class Excecoes{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int resultado = a/b;   
        }catch (ArithmeticException e) {
            System.out.printf("Divisão de " + a + " e " + b + " não é permitida: " + e.getMessage());
        }finally {
            System.out.println("\nBloco finally executado.");
        }
    }
}
