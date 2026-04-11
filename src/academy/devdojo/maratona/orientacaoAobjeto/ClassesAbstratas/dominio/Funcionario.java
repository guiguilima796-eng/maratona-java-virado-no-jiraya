package ClassesAbstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected double salario;

    public Funcionario(String nome,double salario){
        super(nome);
        this.salario = salario;
    }

    @Override
    public void imprime() {
        System.out.println("imprimindo");
    }

    public abstract void bonus();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Funcionario:\n"+
        "Nome:"+this.nome;
    }
}
