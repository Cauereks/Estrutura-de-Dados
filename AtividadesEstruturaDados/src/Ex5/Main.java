package Ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CentralDeInformacoes central = Persistencia.recuperarCentral();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar passageiro");
            System.out.println("2 - Listar passageiros");
            System.out.println("3 - Sair");
            System.out.println("4 - Nova corrida");
            System.out.println("5 - Listar todas as corridas");
            System.out.println("6 - Listar corridas de um passageiro");
            System.out.print("Opção: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Sexo (M/F): ");
                    String sexo = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    Passageiro p = new Passageiro(id, nome, sexo, email);
                    if (central.adicionarPassageiro(p)) {
                        System.out.println("Passageiro cadastrado!");
                    } else {
                        System.out.println("Passageiro já existe!");
                    }
                    break;

                case 2:
                    for (Passageiro passageiro : central.getTodosOsPassageiros()) {
                        System.out.println(passageiro);
                    }
                    break;

                case 4:
                    System.out.print("Informe o ID do passageiro: ");
                    String idPassageiro = sc.nextLine();
                    Passageiro passageiroEscolhido = null;
                    for (Passageiro passageiro : central.getTodosOsPassageiros()) {
                        if (passageiro.getId().equals(idPassageiro)) {
                            passageiroEscolhido = passageiro;
                            break;
                        }
                    }
                    if (passageiroEscolhido == null) {
                        System.out.println("Passageiro não encontrado!");
                        break;
                    }
                    System.out.print("Endereço de partida: ");
                    String partida = sc.nextLine();
                    System.out.print("Endereço de destino: ");
                    String destino = sc.nextLine();
                    Corrida corrida = new Corrida(partida, destino, passageiroEscolhido);
                    if (central.adicionarCorrida(corrida)) {
                        System.out.println("Corrida cadastrada!");
                    } else {
                        System.out.println("Erro ao cadastrar corrida!");
                    }
                    break;

                case 5:
                    for (Corrida c : central.getTodasAsCorridas()) {
                        System.out.println(c);
                    }
                    break;

                case 6:
                    System.out.print("Informe o ID do passageiro: ");
                    String idBusca = sc.nextLine();
                    ArrayList<Corrida> corridas = central.recuperarCorridasDeUmPassageiro(idBusca);
                    if (corridas == null) {
                        System.out.println("Passageiro não existe!");
                    } else if (corridas.isEmpty()) {
                        System.out.println("Passageiro não possui corridas!");
                    } else {
                        for (Corrida c : corridas) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 3:
                    Persistencia.salvarCentral(central);
                    System.out.println("Sistema encerrado!");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
