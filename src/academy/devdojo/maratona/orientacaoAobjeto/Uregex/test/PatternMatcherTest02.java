package academy.devdojo.maratona.orientacaoAobjeto.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    static void main() {
        // \d todos od digitos
        // \D tudo que não for digito
        // \s todos espaços em branco
        // \S tudo que não for espaço em branco
        // \w tudo que for palavra (letras, digitos, _)
        // \W tudo que não for palavra(caracteres especiais)
        String regex = "\\w";
        String text = "@vsdahgvfj ae15623gvhv344jb52";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.start()+"="+matcher.group());
        }



    }
}
