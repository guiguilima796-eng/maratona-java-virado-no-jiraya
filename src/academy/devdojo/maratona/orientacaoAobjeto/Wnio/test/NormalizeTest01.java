package academy.devdojo.maratona.orientacaoAobjeto.Wnio.test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioDoProjeto = "home/guigol/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioDoProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        System.out.println(Files.exists(path1));

        Path path2 = Paths.get("/home/./guigol/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());

    }
}
