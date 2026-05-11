package academy.devdojo.maratona.orientacaoAobjeto.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader01 {
    static void main() {
        File file = new File("file.txt");
        File file2 = new File("gui.txt");

        try(FileWriter fwGui = new FileWriter(file2)){
            fwGui.write("Guilherme Pereira Lima");
            fwGui.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileReader fr = new FileReader(file2)){
//            char[] in = new char[100];
//            fr.read(in);
//            for (char c : in) {
//                System.out.print(c);
//            }
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


}
