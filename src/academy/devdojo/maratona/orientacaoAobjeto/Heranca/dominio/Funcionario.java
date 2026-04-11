package Heranca.dominio;


public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public Funcionario(String nome,String cpf){
        super(nome,cpf);
    }

    public Funcionario(String nome,String cpf,Endereco endereco,double salario){
        super(nome,cpf,endereco);
        this.salario = salario;
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatoriPag(){
        System.out.println("Eu "+this.nome+" Recebo "+this.salario+"R$");
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }


}
