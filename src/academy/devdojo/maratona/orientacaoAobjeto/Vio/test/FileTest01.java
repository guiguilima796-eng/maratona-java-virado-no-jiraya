package academy.devdojo.maratona.orientacaoAobjeto.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    static void main() {
        File file = new File("file.txt");
        try {

            boolean createFile = file.createNewFile();
            System.out.println("File created: " + createFile);
            System.out.println("Path : " + file.getPath());
            System.out.println("Path absolute: " + file.getAbsolutePath());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is hidden: " + file.isHidden());
            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());;
            if (createFile) {
                System.out.println("File delete:" + file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
