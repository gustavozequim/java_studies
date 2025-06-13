import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner menu = new Scanner (System.in);
        System.out.println("Digite um numero para ver sua tabuada:");
        int nmbr = menu.nextInt();
        System.out.println("-=-=-=-=-=-=--=-=-=-=-=-=-=");
        for (int i = 1; i <= 10; i++){
            int resultado = i * nmbr;
            System.out.println(nmbr + " x " + i + " = " + resultado);
        }
        System.out.println("-=-=-=-=-=-=--=-=-=-=-=-=-=");
        menu.close();
    }
}
