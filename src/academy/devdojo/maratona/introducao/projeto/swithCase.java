import java.util.Scanner;
public class swithCase {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o Dia da Semana em Número:");
        byte dia = ler.nextByte();

        switch(dia){
            case 1: 
                System.out.println("Hoje é domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda");
                break;
            case 3: 
                System.out.println("Hoje é Terça");
                break;
            case 4:
                System.out.println("Hoje é Quarta");
                break;
            case 5: 
                System.out.println("Hoje é Quinta");
                break;
            case 6:
                System.out.println("Hoje é Sexta");
                break;
            case 7:
                System.out.println("Hoje é Sábado");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
            
        }
    }
}
