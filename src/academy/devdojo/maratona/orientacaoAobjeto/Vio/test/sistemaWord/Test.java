package academy.devdojo.maratona.orientacaoAobjeto.Vio.test.sistemaWord;

import java.util.Scanner;

public class Test {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("1.Criar Arquivo");
            System.out.println("2.Editar Arquivo");
            System.out.println("3.Excluir Arquivo");
            System.out.println("4.Visualizar Arquivo");
            System.out.println("5.Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do arquivo:");
                    String nomeArquivo = scanner.nextLine();
                    Document document = new Document();
                    document.criarArquivo(nomeArquivo);
                    break;
                case 2:
                    System.out.println("Digite o nome do arquivo:");
                    String nomeArquivo2 = scanner.nextLine();
                    System.out.println("Digite o texto:");
                    String texto = scanner.nextLine();
                    Document document2 = new Document();
                    document2.editarArquivo(nomeArquivo2, texto);
                    break;
                case 3:
                    System.out.println("Digite o nome do arquivo:");
                    String nomeArquivo3 = scanner.nextLine();
                    Document document3 = new Document();
                    document3.excluirArquivo(nomeArquivo3);
                    break;
                case 4:
                    System.out.println("Digite o nome do arquivo:");
                    String nomeArquivo4 = scanner.nextLine();
                    Document document4 = new Document();
                    document4.visualizarArquivo(nomeArquivo4);
                    break;
                case 5:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }while (opcao != 5);
    }
}
