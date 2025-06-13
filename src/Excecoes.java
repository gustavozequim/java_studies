public class Excecoes{
    public static void main(String[] args) {
        try{
            int resultado = 10/0;   
        }catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é permitida: " + e.getMessage());
        }finally {
            System.out.println("Bloco finally executado.");
        }
    }
}
