package academy.devdojo.maratona.orientacaoAobjeto.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    static void main() throws IOException{
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subPastaPath = Paths.get("pasta/subPasta/subsubPasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");

        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "fileReadme.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
