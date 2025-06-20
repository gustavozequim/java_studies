import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Crud_em_memoria {
    public static void main(String[] args) {
        Scanner cmndLine = new Scanner (System.in);
        Map<String, String> livros = new HashMap<>();
        livros.put("JRR Tolkien", "O Senhor dos Aneis: Sociedade do Anel");
        livros.put("JRR Tolkien", "O Senhor dos Aneis: As Duas Torres");
        livros.put("JRR Tolkien", "O Senhor dos Aneis: O Retorno do Rei");
        System.out.println("Segue abaixo as opcoes, o que deseja fazer?:");
        System.out.println("""
        [1] Listar livros
        [2] Adicionar Livro
        [3] Editar Livro
        [4] Apagar Livro
        [5] Sair
        """);
        int opcao = cmndLine.nextInt();
        
        switch (opcao) {
        case 1:
            livros.entrySet().forEach(entry -> {
            System.out.println("Autor: " + entry.getKey() + ", Titulo: " + entry.getValue());
        });
            break;
        case 2:
            System.out.print("\nOK! Vamos la.\n");
            cmndLine.nextLine();
            System.out.println("Titulo: ");
            String novoLivroTit = cmndLine.nextLine();
            System.out.println("Autor: ");
            String novoLivroAut = cmndLine.nextLine();
            livros.put(novoLivroAut, novoLivroTit);

            livros.entrySet().forEach(entry -> {
            System.out.println("Autor: " + entry.getKey() + ", Titulo: " + entry.getValue());
        });
            break;

        case 3:
            System.out.print("\nOpção Produtos Selecionado\n");
            break;

        default:
            System.out.print("\nOpção Inválida!");
            break;

        case 4:
            System.out.print("\nAté logo!");
            cmndLine.close();       
        }

    }
}
