package Projeto.test;

import Projeto.dominio.Funcionario;
import Projeto.dominio.Servico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Projeto.dominio.Agendamento;
import Projeto.dominio.Barbearia;
import Projeto.dominio.Endereco;

public class BarbeariaTest {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        menu();
        // Endereco endereco1 = new Endereco("Rua A", "123", "Bairro B", "Cidade C", "Estado D", "00000-000");
        // Funcionario funcionario1 = new Funcionario("João", Projeto.dominio.Cargo.BARBEIRO, "1111-1111", endereco1);

        // Endereco endereco2 = new Endereco("Rua X", "456", "Bairro Y", "Cidade Z", "Estado W", "11111-111");
        // Funcionario funcionario2 = new Funcionario("Maria", Projeto.dominio.Cargo.RECEPCIONISTA, "2222-2222", endereco2);
        
        // Endereco enderecoBarbearia = new Endereco("Rua Q", "789", "Bairro R", "Cidade S", "Estado T", "22222-222");
        // Barbearia barbeariaTop = new Barbearia("Barbearia Top", enderecoBarbearia, "3333-3333", "09:00 - 18:00");
        // barbeariaTop.setFuncionarios(new ArrayList<Funcionario>(java.util.Arrays.asList(funcionario1, funcionario2)));
        
        // barbeariaTop.registrarServico(Servico.CORTE_DE_CABELO);
        // barbeariaTop.registrarServico(Servico.PINTAR_CABELO);
        // barbeariaTop.registrarServico(Servico.MANICURE);
        // barbeariaTop.registrarServico(Servico.PEDICURE);
        // barbeariaTop.listarServicos();

        // barbeariaTop.registrarEntradaCaixa(Servico.CORTE_DE_CABELO);
        // barbeariaTop.registrarEntradaCaixa(Servico.MANICURE);
        // barbeariaTop.registrarEntradaCaixa(Servico.PINTAR_CABELO);

        // Agendamento agendamento1 = new Agendamento(new java.util.Date(), "10:00", "Corte de Cabelo", funcionario1);
        // Agendamento agendamento2 = new Agendamento(new java.util.Date(), "11:00", "Manicure", funcionario2);
        
        // barbeariaTop.setAgendamento(new ArrayList<Agendamento>(Arrays.asList(agendamento1, agendamento2)));
        
        // System.out.println(barbeariaTop);
    }   

    public static void menu() {
        
        List<Barbearia> barbearias = new ArrayList<>();
        int opcao = 0;
        do {
            
            System.out.println("----- Barber System -----");
            System.out.println("1.Registrar Barbearia");
            System.out.println("2. Registrar Serviço");
            System.out.println("3. Listar Serviços");
            System.out.println("4. Registrar Entrada no Caixa");
            System.out.println("5. Registrar Saída do Caixa");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                // TODO: handle exception
                System.out.println("Digite um número válido para a opção.");
                scanner.next(); // Limpar o buffer do scanner
            }
            

            switch (opcao) {
                case 1:
                    String nomeBarbearia;
                    System.out.println("Registrar Barbearia");
                    System.out.print("Nome da Barbearia: ");
                    nomeBarbearia = scanner.next().toLowerCase();
                    System.out.println("Endereço da Barbearia:");
                    System.out.println("Rua: ");
                    String rua = scanner.next();
                    System.out.println("Número: ");
                    String numero = scanner.next();
                    System.out.println("Bairro: ");
                    String bairro = scanner.next();
                    System.out.println("Cidade: ");
                    String cidade = scanner.next();
                    System.out.println("Estado: ");
                    String estado = scanner.next();
                    String cep;
                    do {
                        System.out.println("CEP(8 digítos): ");
                        cep = scanner.next();
                        if (cep.length() != 8) {
                            System.out.println("CEP inválido. Digite novamente.");
                        }
                    } while (cep.length() != 8);
                    
                    Endereco enderecoBarbearia = new Endereco(rua, numero, bairro, cidade, estado, cep);

                    System.out.println("Telefone da Barbearia: ");
                    String telefone = scanner.next();
                    System.out.println("Horário de Funcionamento da Barbearia: ");
                    String horarioFuncionamento = scanner.next();

                    try {
                        Barbearia barbearia = new Barbearia(nomeBarbearia, enderecoBarbearia, telefone, horarioFuncionamento);
                        barbearias.add(barbearia);
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Erro ao registrar barbearia: " + e.getMessage());
                    }

                    System.out.println("Barbearia registrada com sucesso!");
                    
                    break;
                case 2:

                    System.out.println("Registrar Serviço");
                    System.out.println("Escolha a barbearia:");
                    for (int i = 0; i < barbearias.size(); i++) {
                        System.out.println((i + 1) + ". " + barbearias.get(i).getNome());
                    }
                    int escolhaBarbearia = scanner.nextInt();
                    Barbearia barbeariaEscolhida = barbearias.get(escolhaBarbearia - 1);

                    System.out.println("Opções de Serviços ainda não implementada.");
                    for (Servico servico : Servico.values()) {
                        System.out.println(servico.ordinal() + 1 + ". " + servico);
                    }

                    System.out.print("Escolha o serviço a ser registrado: ");
                    int escolhaServico = scanner.nextInt();
                    if (escolhaServico >= 1 && escolhaServico <= Servico.values().length) {
                        if (escolhaServico == 1) {
                            barbeariaEscolhida.registrarServico(Servico.CORTE_DE_CABELO);
                        } else if (escolhaServico == 2) {
                            barbeariaEscolhida.registrarServico(Servico.PINTAR_CABELO);
                        } else if (escolhaServico == 3) {
                            barbeariaEscolhida.registrarServico(Servico.MANICURE);
                        } else if (escolhaServico == 4) {
                            barbeariaEscolhida.registrarServico(Servico.PEDICURE);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Listar Serviços");
                    System.out.println("Escolha a barbearia:");
                    for (int i = 0; i < barbearias.size(); i++) {
                        System.out.println((i + 1) + ". " + barbearias.get(i).getNome());
                    }
                    escolhaBarbearia = scanner.nextInt();
                    barbeariaEscolhida = barbearias.get(escolhaBarbearia - 1);
                    barbeariaEscolhida.listarServicos();
                    break;
                case 4:
                    System.out.println("Registrar Entrada no Caixa");
                    System.out.println("Escolha a barbearia:");
                    for (int i = 0; i < barbearias.size(); i++) {
                        System.out.println((i + 1) + ". " + barbearias.get(i).getNome());
                    }
                    escolhaBarbearia = scanner.nextInt();
                    barbeariaEscolhida = barbearias.get(escolhaBarbearia - 1);
                    // Lógica para registrar entrada no caixa
                    System.out.println("Serviços oferecidos:");
                    List<Servico> servicos = new ArrayList<>(barbeariaEscolhida.getServicosOferecidos().keySet());
                    for (Servico servico : servicos) {
                        System.out.println(servico);
                    }
                    System.out.println("Digite o serviço para registrar a entrada no caixa:");
                    String servico = scanner.next().toUpperCase();
                    try {
                        barbeariaEscolhida.registrarEntradaCaixa(Servico.valueOf(servico));
                    } catch (IllegalArgumentException e) {
                        // TODO: handle exception
                        System.out.println("Erro ao registrar entrada no caixa: " + e.getMessage());
                    }

                    // System.out.println("Entrada no caixa no valor de " + barbeariaEscolhida.getServicosOferecidos().get(Servico.valueOf(servico)) + " registrada com sucesso!");
                    
                    break;
                case 5:
                    System.out.println("Registrar Saída do Caixa");
                    System.out.println("Escolha a barbearia:");
                    for (int i = 0; i < barbearias.size(); i++) {
                        System.out.println((i + 1) + ". " + barbearias.get(i).getNome());
                    }
                    escolhaBarbearia = scanner.nextInt();
                    barbeariaEscolhida = barbearias.get(escolhaBarbearia - 1);
                    System.out.print("Digite o valor da saída do caixa: ");
                    double valorSaida = scanner.nextDouble();
                    barbeariaEscolhida.registrarSaidaCaixa(valorSaida);
                    // System.out.println("Saída do caixa no valor de " + valorSaida + " registrada com sucesso!");
                    break;
                case 6:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            // Lógica para ler a opção do usuário e executar as ações correspondentes
        } while (opcao != 6);
        
    }
}
