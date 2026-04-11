package LojaDeCarro.dominio;

public class Carro {
    private String nome;
    private String ano;
    private String potência;
    private MarcaCarro marcaDoCarro;

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public MarcaCarro getMarcaDoCarro() {
        return marcaDoCarro;
    }

    public void setMarcaDoCarro(MarcaCarro marcaDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
    }

    public String getPotência() {
        return potência;
    }

    public void setPotência(String potência) {
        this.potência = potência;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
