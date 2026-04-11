package introducaoMetodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public int qtd;
    public void imprime(){
        qtd++;
        System.out.println("Quantidade de Impresões:"+qtd);
        System.out.println("-----------------");
        System.out.println("Nome:"+this.nome);
        System.out.println("Idade:"+this.idade);
        System.out.println("Sexo:"+this.sexo);
    }
}
