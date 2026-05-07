package academy.devdojo.maratona.orientacaoAobjeto.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    static void main() {
        // \d todos od digitos
        // \D tudo que não for digito
        // \s todos espaços em branco
        // \S tudo que não for espaço em branco
        // \w tudo que for palavra (letras, digitos, _)
        // \W tudo que não for palavra(caracteres especiais)
        // []
        String regex = "0[xX][0-9a-fA-F]+";

        String text = "0x10, 0X1A, 0xG1, 123";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.start()+"="+matcher.group());
        }

        String text2 = "Golll do flamendo,aos 45 minutos";
        //Pattern pattern2 = Pattern.compile(regex);
        Matcher matcher2 = pattern.matcher(text2);
        System.out.println("---------------");
        while (matcher2.find()) {
            System.out.println(matcher2.start()+"="+matcher2.group());
        }




    }
}
