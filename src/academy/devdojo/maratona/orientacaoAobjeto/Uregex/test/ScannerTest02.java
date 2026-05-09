package academy.devdojo.maratona.orientacaoAobjeto.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    static void main() {
        String text = "O rato roeu a roupa do rei de roma";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(" ");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else if (scanner.hasNextDouble()) {
                double d = scanner.nextDouble();
                System.out.println(scanner.next());
            }
        }


    }
}
