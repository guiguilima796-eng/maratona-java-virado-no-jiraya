package Projeto.dominio;

import java.io.IOException;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Barbearia {
    private String nome;
    private Endereco endereco;
    private String telefone;
    private List<Agendamento> agendamento = new ArrayList<>();
    private String horarioFuncionamento;
    private Map<Servico, Double> servicosOferecidos = new java.util.HashMap<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private double caixa;

    public Barbearia(String nome, Endereco endereco, String telefone, String horarioFuncionamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.horarioFuncionamento = horarioFuncionamento;
        this.caixa = 0.0;
    }

    public Barbearia(String nome, Endereco endereco, String telefone, String horarioFuncionamento, Map<Servico, Double> servicosOferecidos, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.horarioFuncionamento = horarioFuncionamento;
        this.servicosOferecidos = servicosOferecidos;
        setFuncionarios(funcionarios);
        this.caixa = 0.0;
    }

    public void registrarEntradaCaixa(Servico servico) {
        System.out.println("------------------------------------");
        try {
            if (servicosOferecidos.containsKey(servico)) {
                this.caixa += servicosOferecidos.get(servico);
                System.out.println("Entrada no Caixa de R$ " + servicosOferecidos.get(servico) + " pelo serviço: " + servico);
            } else {
                System.out.println("Serviço não encontrado: " + servico);
            }
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("Erro ao registrar a entrada no caixa: " + e.getMessage()+ ", Tente Novamente!");
        }
        System.out.println("------------------------------------");
    }

    public void registrarSaidaCaixa(double valor) {
        if (valor <= caixa) {
            this.caixa -= valor;
        } else {
            System.out.println("Saldo insuficiente no caixa.");
        }
    }

    public void registrarServico(Servico servico) {
        try {
            System.out.println("------------------------------------");
            servicosOferecidos.put(servico, servico.calcularPrecoServico());
            System.out.println("Serviço registrado com sucesso: " + servico + " - R$ " + servico.calcularPrecoServico());
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            System.out.println("Erro ao registrar o serviço: " + e.getMessage()+ ", Tente Novamente!");
        }
        System.out.println("------------------------------------");
        
    }

    public void removerServico(Servico servico) {
        if (servicosOferecidos.containsKey(servico)) {
            servicosOferecidos.remove(servico);
            System.out.println("Serviço removido com sucesso: " + servico);
        } else {
            System.out.println("Serviço não encontrado: " + servico);
        }
    }

    public void listarServicos() {
        System.out.println("------------------------------------");
        System.out.println("Serviços oferecidos pela barbearia " + nome + ":");
        for (Map.Entry<Servico, Double> entry : servicosOferecidos.entrySet()) {
            System.out.println("- " + entry.getKey() + ": R$ " + entry.getValue());
        }
        System.out.println("------------------------------------");
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários da barbearia " + nome + ":");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("- " + funcionario.getNome() + " (" + funcionario.getCargo() + ")");
        }
    }

    public List<Agendamento> getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(List<Agendamento> agendamento) {
        this.agendamento.addAll(agendamento);
    }

    public double getCaixa() {
        return caixa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public Map<Servico, Double> getServicosOferecidos() {
        return servicosOferecidos;
    }

    public void setServicosOferecidos(Map<Servico, Double> servicosOferecidos) {
        this.servicosOferecidos = servicosOferecidos;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            funcionario.setSalario(funcionario.getCargo().calcularSalario());
            this.funcionarios.add(funcionario);
        }
        System.out.println("Funcionário(s) adicionados com sucesso à barbearia " + nome);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Barbearia: " + nome + 
        ",\n Endereço: " + endereco + 
        ",\n Telefone: " + telefone + 
        ",\n Horário de Funcionamento: " + horarioFuncionamento + 
        ",\n Caixa: R$ " + caixa +
        ",\n Serviços Oferecidos: " + servicosOferecidos.keySet() +
        ",\n Número de Funcionários: " + (funcionarios != null ? funcionarios.size() : 0)+
        ",\n Valor no Caixa: R$ " + caixa +
        ",\n Agendamentos: " + this.agendamento;
    }
}
