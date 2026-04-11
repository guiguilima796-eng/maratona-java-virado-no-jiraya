package Projeto.dominio;

public class Funcionario {
    private String nome;
    private Cargo cargo;
    private String telefone;
    private Endereco endereco;
    private double salario;

    public Funcionario(String nome, Cargo cargo, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cargo = cargo;
        this.telefone = telefone;
        this.endereco = endereco;
        this.salario = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", telefone=" + telefone + ", endereco=" + endereco + ", salario=" + salario + "]";
    }

}
