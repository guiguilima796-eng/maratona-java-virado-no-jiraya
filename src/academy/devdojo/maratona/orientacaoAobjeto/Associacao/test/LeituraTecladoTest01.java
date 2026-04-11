package Associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite seu nome:");
        String nome = ler.nextLine();
        System.out.println("Digite sua Idade:");
        int idade = ler.nextInt();
        System.out.println("Digite seu sexo 'F' ou 'M' :");
        char sexo = ler.next().charAt(0);
        System.out.println("------------------------");
        System.out.println("Nome:"+nome);
        System.out.println("Idade"+idade);
        System.out.println("Sexo:"+sexo);
        System.out.println("------------------------");
    }
}
