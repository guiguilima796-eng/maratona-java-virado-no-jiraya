package Projeto.dominio;

import java.util.Date;

public class Agendamento {
    private Date data;
    private String hora;
    private String servico;
    private Funcionario funcionario;

    public Agendamento(Date data, String hora, String servico, Funcionario funcionario) {
        this.data = data;
        this.hora = hora;
        this.servico = servico;
        this.funcionario = funcionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Agendamento [data=" + data + ", hora=" + hora + ", servico=" + servico + ", funcionario=" + funcionario + "]";
    }
}