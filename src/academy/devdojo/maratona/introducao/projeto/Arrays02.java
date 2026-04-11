

public class Arrays02 {
    public static void main(String[] args) {
        //inicialização padrão
        //byte,short,int,long = 0
        //boolean = false
        //string = null

        String[] nomes = new String[3];
        nomes[0] = "gui";
        nomes[1] = "gol";
        nomes[2] = "Deus";

        for (String nome: nomes ) {
            System.out.println(nome);
        }

    }
}
