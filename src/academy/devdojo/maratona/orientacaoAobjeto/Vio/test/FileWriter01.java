package academy.devdojo.maratona.orientacaoAobjeto.Vio.test;

import java.io.File;
import java.io.FileWriter;

public class FileWriter01 {
    static void main() {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file, true);){
            fw.write("Java não é pros Fracos\n");
            fw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }

        writeToFile("file", "Java é vida");
    }

    static void writeToFile(String nome, String texto) {
        File file = new File(nome+".txt");
        try(FileWriter fw = new FileWriter(file, true);){
            fw.write(texto+"\n");
            fw.flush();
            System.out.println("Texto escrito com Sucesso: "+texto);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
