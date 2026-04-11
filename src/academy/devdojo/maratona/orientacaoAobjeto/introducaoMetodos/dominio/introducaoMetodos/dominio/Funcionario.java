package introducaoMetodos.dominio.introducaoMetodos.dominio;
public class Funcionario {
    private int idade;
    private String nome;
    private double[] salario = new double[3];
    private double media;

    public int getIdade() {
        return idade;
    }
    public double getMedia() {
        return media;
    }
    public double[] getSalario() {
        return salario;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double[] salario) {
        this.salario = salario;
    }
    
    public void imprimirDados(){
        System.out.println("Nome"+this.nome);
        System.out.println("Idade"+this.idade);
        
        double soma = 0;
        for (int i =0;i < this.salario.length;i++) {
            soma += this.salario[i];
            System.out.println("Sálario "+ (i+1)+" = "+this.salario[i]);
        }

        this.media = soma/this.salario.length;
        System.out.println("Média Sálarial ="+this.media);
    }
}
