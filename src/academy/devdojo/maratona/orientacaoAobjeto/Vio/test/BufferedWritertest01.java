package academy.devdojo.maratona.orientacaoAobjeto.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritertest01 {
    static void main() {
        File file = new File("file.txt");
//        File file2 = new File("gui.txt");

        try(FileWriter fwGui = new FileWriter(file); BufferedWriter bwGui = new BufferedWriter(fwGui);){
            bwGui.write("Guilherme Pereira Lima");
            bwGui.newLine();
            bwGui.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
