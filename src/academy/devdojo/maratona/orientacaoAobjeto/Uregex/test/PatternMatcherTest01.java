package academy.devdojo.maratona.orientacaoAobjeto.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    static void main() {
        String regex = "ab";
        String text = "abacate,abacaxi";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println(regex);
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
        for (int i = 0; i < text.length(); i++) {
            System.out.print(i+" ");
        }

        System.out.println("\nPosições Encontradas: ");

        while (matcher.find()) {
            System.out.print(matcher.start()+" ");
        }
        System.out.println("\n---------------");


        String texto = "gui10";
        boolean resultado = texto.matches("[a-z]+\\d+");
        System.out.println(texto);
        System.out.println(resultado);
    }
}
