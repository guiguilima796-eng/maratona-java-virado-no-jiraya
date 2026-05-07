package academy.devdojo.maratona.orientacaoAobjeto.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    static void main() {
        // \d todos od digitos
        // \D tudo que não for digito
        // \s todos espaços em branco
        // \S tudo que não for espaço em branco
        // \w tudo que for palavra (letras, digitos, _)
        // \W tudo que não for palavra(caracteres especiais)
        // []
        //? Zero ou uma
        //* Zero ou mais
        //+ uma ou mais
        //{n,m} de n até m
        //()
        // | ou
        //$ fim da linha
        // . 1.3,1a3,1@3

        String regex = "([a-zA-Z\\d\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

        String text = "fulano#gmail.com, gui123@hotmail.com, 123hdsbfh@gmail.com,teste@gmail.com";
        System.out.println("123hdsbfh@gmail.com".matches(regex));
        System.out.println(text.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.start()+"="+matcher.group());
        }

        /*String text2 = "Golll do flamendo,aos 45 minutos";
        //Pattern pattern2 = Pattern.compile(regex);
        Matcher matcher2 = pattern.matcher(text2);
        System.out.println("---------------");
        while (matcher2.find()) {
            System.out.println(matcher2.start()+"="+matcher2.group());
        }*/




    }
}
