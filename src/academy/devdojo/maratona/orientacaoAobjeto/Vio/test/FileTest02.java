package academy.devdojo.maratona.orientacaoAobjeto.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    static void main() throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio,"file.txt");
        boolean isArquivoDiretorio = fileArquivoDiretorio.createNewFile();
        System.out.println(isArquivoDiretorio);

        File fileRename = new File(fileDiretorio,"arquivoRenomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRename);
        System.out.println("Arquivo Renomeado ?"+isRenamed);

        File renameDiretorio = new File("DiretorioRenomeado");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(renameDiretorio);
        System.out.println("Diretorio Renomeado?"+isDiretorioRenomeado);

    }
}
