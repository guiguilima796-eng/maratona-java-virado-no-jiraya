package modificadorStatic.dominio;

public class Carro {
    private String nome;
    private double velMax;
    private static double velLim = 250;

    public Carro(String nome,double velMax){
        this.nome = nome;
        this.velMax =velMax;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.velMax);
        System.out.println(Carro.velLim);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setVelMax(double velMax){
        this.velMax = velMax;
    }

    public static void setVelLim(double velLim){
        Carro.velLim = velLim;
    }

    public static double getVelLim(){
        return Carro.velLim;
    }

    public String getNome(){
        return this.nome;
    }

    public double getVelMax(){
        return this.velMax;
    }
}
