package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CentralDeInformacoes central = null;

        try {
            central = Persistencia.recuperarCentral();
            System.out.println("Central carregada com sucesso!");
        } catch (Exception e) {
            System.out.println("Não foi possível carregar a central, criando nova...");
            central = new CentralDeInformacoes();
        }

        String opcao = "";
        while (!opcao.equalsIgnoreCase("S")) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Novo Passageiro");
            System.out.println("2 - Listar Todos os Passageiros");
            System.out.println("3 - Exibir Passageiro por CPF");
            System.out.println("S - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Digite o email: ");
                    String email = scanner.nextLine();

                    Passageiro novo = new Passageiro(nome, cpf, email);

                    if (central.adicionarPassageiro(novo)) {
                        System.out.println("Passageiro cadastrado com sucesso!");
                        try {
                            Persistencia.salvarCentral(central);
                        } catch (Exception e) {
                            System.out.println("Erro ao salvar: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Já existe um passageiro com este CPF!");
                    }
                    break;

                case "2":
                    System.out.println("\n--- Lista de Passageiros ---");
                    for (Passageiro p : central.listarPassageiros()) {
                        System.out.println(p);
                    }
                    break;

                case "3":
                    System.out.print("Digite o CPF do passageiro: ");
                    String buscaCpf = scanner.nextLine();
                    Passageiro encontrado = central.buscarPassageiroPorCPF(buscaCpf);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Passageiro não encontrado!");
                    }
                    break;

                case "S":
                case "s":
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}

