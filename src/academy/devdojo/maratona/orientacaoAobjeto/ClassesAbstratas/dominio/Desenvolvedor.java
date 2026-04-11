package ClassesAbstratas.dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void bonus() {
        // TODO Auto-generated method stub
        this.salario += this.salario * 0.2;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "(Desenvolvedor):\n"+
        "Nome:"+this.nome+"\n"+
        "Salario:"+this.salario;
    }
}
