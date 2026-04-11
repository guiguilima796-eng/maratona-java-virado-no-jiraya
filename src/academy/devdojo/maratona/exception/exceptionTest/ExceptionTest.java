package academy.devdojo.maratona.exception.exceptionTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExceptionTest {
    public static void main(String[] args) {
        //Checked Exception
        criarNovoArquivo("guigol.txt");
    }

    public static void criarNovoArquivo(String nomeArquivo) {
        Path caminho = Path.of("arquivo/" + nomeArquivo);
        try {
            Files.createDirectories(caminho.getParent());
            Files.createFile(caminho);

            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
