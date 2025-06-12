import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner menu = new Scanner (System.in);
        int nmbr = menu.nextInt();
        long fat = 1;
        System.out.printf("O fatorial de " + nmbr);
        for (int i = 1; i <= nmbr; i++){
            fat *= i;
        }
        System.out.printf(" é " + fat);
        menu.close();
    }
}
