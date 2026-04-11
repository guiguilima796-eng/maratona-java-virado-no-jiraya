package academy.devdojo.maratona.orientacaoAobjeto.gerenciamentoDeSeminarios.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public Seminario(String titulo,Aluno[] alunos,Professor professor,Local local){
        this.titulo =titulo;
        this.alunos = alunos;
        this.local =local;
    }

    public void imprime(){
        System.err.println("-----Seminario-----");
        System.out.println("Titulo : "+this.titulo);
        if (alunos != null) {
            System.out.println("Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        }else{
            System.out.println("Alunos : Sem Alunos");
        }

        if (local != null) {
            System.out.println("Local : "+local.getEndereco());
        } else {
            System.out.println("Local : Sem Local");
        }
        System.out.println("--------------------");
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
