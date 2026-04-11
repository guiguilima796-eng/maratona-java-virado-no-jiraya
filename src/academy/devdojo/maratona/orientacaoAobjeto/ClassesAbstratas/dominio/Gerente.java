package ClassesAbstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void bonus() {
        this.salario += this.salario * 0.1;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "(Gerente):\n"+
        "Nome:"+this.nome+"\n"+
        "Salario:"+this.salario;
    }
}
