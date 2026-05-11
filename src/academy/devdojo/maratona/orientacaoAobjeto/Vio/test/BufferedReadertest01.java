package academy.devdojo.maratona.orientacaoAobjeto.Vio.test;

import java.io.*;

public class BufferedReadertest01 {
    static void main() {
        File file = new File("file.txt");
//        File file2 = new File("gui.txt");

        try(FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){
            String linha;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
