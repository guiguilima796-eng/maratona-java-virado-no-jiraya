package academy.devdojo.maratona.orientacaoAobjeto.Uregex.test;

public class ScannerTest01 {
    static void main() {
            String text = "O rato roeu a roupa do rei de roma";
            String[] array = text.split(" ");
            for (String s : array) {
                System.out.println(s);
            }
    }
}
