package modificadorStatic.dominio;

public class Anime{
    public String nome;
    public int ano;
    public int eps;
    public String genero;
    public String estudio;

    public Anime(String nome,int ano,int eps,String genero){
        this();
        this.nome = nome;
        this.ano = ano;
        this.eps = eps;
        this.genero = genero;
    }

    public Anime(String nome,int ano,int eps,String genero,String estudio){
        this(nome,ano,eps,genero);
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construor sem argumentos!!");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.ano);
        System.out.println(this.eps);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }
}