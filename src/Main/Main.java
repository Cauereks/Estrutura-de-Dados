package Main;

import java.util.Scanner;
import Class.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cadastro do Gerente
        System.out.print("Digite o nome do Gerente: ");
        String nomeGerente = sc.nextLine();
        System.out.print("Digite o salário do Gerente: ");
        double salarioGerente = sc.nextDouble();
        sc.nextLine(); // consumir quebra de linha

        Funcionario gerente = new Gerente(nomeGerente, salarioGerente);

        // Cadastro do Programador
        System.out.print("Digite o nome do Programador: ");
        String nomeProgramador = sc.nextLine();
        System.out.print("Digite o salário do Programador: ");
        double salarioProgramador = sc.nextDouble();

        Funcionario programador = new Programador(nomeProgramador, salarioProgramador);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Imprimir dados (Gerente e Programador)");
            System.out.println("2 - Aumentar salário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Dados dos Funcionários ---");
                    System.out.println("Gerente -> Nome: " + gerente.getNome() + ", Salário: " + gerente.getSalario());
                    System.out.println("Programador -> Nome: " + programador.getNome() + ", Salário: " + programador.getSalario());
                    break;

                case 2:
                    System.out.println("1 - Gerente");
                    System.out.println("2 - Programador");
                    System.out.print("Escolha: ");
                    int opAumento = sc.nextInt();

                    if (opAumento == 1) {
                        gerente.aumentaSalario();
                        System.out.println("Novo salário do Gerente: " + gerente.getSalario());
                    } else if (opAumento == 2) {
                        programador.aumentaSalario();
                        System.out.println("Novo salário do Programador: " + programador.getSalario());
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}

