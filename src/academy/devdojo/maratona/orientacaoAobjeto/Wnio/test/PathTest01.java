package academy.devdojo.maratona.orientacaoAobjeto.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    static void main() {
        Path p1 = Paths.get("/home/guigol/Documentos/Projetos/Maratona-Java-Virado-No-Jiraya/file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p1.getParent());
        System.out.println(p1.getRoot());
    }
}
