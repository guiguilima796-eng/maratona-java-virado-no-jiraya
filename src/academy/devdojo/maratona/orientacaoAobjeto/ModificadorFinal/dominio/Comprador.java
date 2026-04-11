package ModificadorFinal.dominio;

public class Comprador {
    private String nome;

    // public Comprador(String nome){
    //     this.nome = nome;
    // }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome:"+this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
