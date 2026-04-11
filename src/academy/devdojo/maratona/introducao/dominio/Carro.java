package dominio;

public class Carro {
    public String nome;
    public String modelo; 
    public int ano;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int a){
        this.ano = a;
    }




}
