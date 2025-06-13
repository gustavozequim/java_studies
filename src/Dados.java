import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        Scanner menu = new Scanner (System.in);

        System.out.print("##--Teste Estrutura de Menu--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Novo Cadastro     |\n");
        System.out.print("| Opção 2 - Clientes          |\n");
        System.out.print("| Opção 3 - Produtos          |\n");
        System.out.print("| Opção 4 - Sair              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();


        switch (opcao) {
        case 1:
            System.out.print("\nOpção Novo Cadastro Selecionado");
            break;

        case 2:
            System.out.print("\nOpção Clientes Selecionado\n");
            break;

        case 3:
            System.out.print("\nOpção Produtos Selecionado\n");
            break;

        default:
            System.out.print("\nOpção Inválida!");
            break;

        case 4:
            System.out.print("\nAté logo!");
            menu.close();       
        }
    }
}