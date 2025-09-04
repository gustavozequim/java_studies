
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Crud_em_memoria {
    public static void main(String[] args) {
        Scanner cmndLine = new Scanner (System.in);
        Map<String, String> livros = new HashMap<>();
        livros.put("Sociedade do Anel", "JRR Tolkien");
        livros.put("As Duas Torres", "JRR Tolkien");
        livros.put("O Retorno do Rei", "JRR Tolkien");
        boolean sairDoWhile = false;
        while (true) {
            System.out.println("Segue abaixo as opcoes, o que deseja fazer?:");
            System.out.println("[1]Listar livros");
            System.out.println("[2] Adicionar Livro");
            System.out.println("[3] Editar Livro");
            System.out.println("[4] Apagar Livro");
            System.out.println("[5] Sair");
            int opcao = cmndLine.nextInt();
            
            switch (opcao) {            
            case 1:
                livros.forEach((titulo, autor) -> System.out.println("Autor: " + autor + ", Titulo: " + titulo + "\n"));
                break;
            case 2:
                System.out.print("\nOK! Vamos la.\n");
                cmndLine.nextLine();
                System.out.println("Titulo: ");
                String novoLivroTit = cmndLine.nextLine();
                System.out.println("Autor: ");
                String novoLivroAut = cmndLine.nextLine();
                livros.put(novoLivroTit, novoLivroAut);
                System.out.println("\nNovo livro adicionado: " + novoLivroTit + ".\n");
                livros.forEach((titulo, autor) -> System.out.println("Autor: " + autor + ", Titulo: " + titulo));
                continue;

            case 3:
                System.out.print("\nDigite o livro que deseja editar\n");
                cmndLine.nextLine();
                String editLivro = cmndLine.nextLine();
                System.out.println("O que deseja editar? Digite T para titulo e A para autor:");
                String opEdit = cmndLine.nextLine().toLowerCase();

                switch (opEdit) {
                    case "a":
                    System.out.println("Digite o novo autor:");
                        String novoAutor = cmndLine.nextLine();
                        livros.put(editLivro, novoAutor);
                        System.out.println("Lista atualizada:");
                        livros.forEach((titulo, autor) -> System.out.println("Autor: " + autor + ", Titulo: " + titulo));
                        break;
                    case "t":
                        String aut = livros.get(editLivro);
                        livros.remove(editLivro);
                        System.out.println("Digite o novo titulo:");
                        String novoTitulo = cmndLine.nextLine();
                        livros.put(novoTitulo, aut);
                        System.out.println("Lista atualizada:");
                        livros.forEach((titulo, autor) -> System.out.println("Autor: " + autor + ", Titulo: " + titulo));
                    default:
                        System.out.println("Opção inválida!");
                            break;
                    }
                continue;

            case 4:
                System.out.print("\nDigite o livro que deseja apagar (Titulo igual ao cadastrado)\n");
                cmndLine.nextLine();
                String rmvLivro = cmndLine.nextLine();
                System.out.print("\nApagando...\n");
                livros.remove(rmvLivro);
                System.out.println("Lista de livros atualizadas:");
                livros.forEach((titulo, autor) -> System.out.println("Autor: " + autor + ", Titulo: " + titulo));
                continue;
            case 5:
                sairDoWhile = true;
                break;
            }
            if (sairDoWhile) {
                break;
            }
        }
        cmndLine.close();
        System.out.println("\nAte logo!\n");
    }
}
