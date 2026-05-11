package academy.devdojo.maratona.orientacaoAobjeto.Vio.test.sistemaWord;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Document {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private String descricao;

    public void criarArquivo(String nome) {
        File  file = new File(this.nome + ".txt");
        System.out.println("Arquivo criado com Sucesso: " + file.getName());
    }

    public void editarArquivo(String nome, String Texto) {
        try(FileWriter fw = new FileWriter(this.nome + ".txt");) {
           fw.write(Texto);
           System.out.println("Arquivo editado com Sucesso: " + this.nome + ".txt");
           fw.flush();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void excluirArquivo(String nome){
        File file = new File(this.nome + ".txt");
        file.delete();
        System.out.println("Arquivo excluido com Sucesso: " + this.nome + ".txt");
    }

    public void visualizarArquivo(String nome){
        File file = new File(this.nome + ".txt");
        try(FileReader fr = new FileReader(file);){
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            int sair = 0;
            do {
                System.out.println("Cilque em 1 para Voltar ao Menu");
                sair = scanner.nextInt();
            }while (sair != 1);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
