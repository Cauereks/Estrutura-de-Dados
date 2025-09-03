package Ex1;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    private static ArrayList<Passageiro> passageiros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (true) {
            System.out.println("\n--- Sistema de Passageiros ---");
            System.out.println("1 - Cadastrar passageiro");
            System.out.println("2 - Listar passageiros");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine(); 

            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    try {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Sexo (MASCULINO/FEMININO): ");
                        Sexo sexo = Sexo.valueOf(sc.nextLine().toUpperCase());

                        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
                        Date dataNascimento = sdf.parse(sc.nextLine());

                        System.out.print("Email: ");
                        String email = sc.nextLine();

                        if (existeEmail(email)) {
                            System.out.println("⚠ Já existe um passageiro com esse e-mail!");
                        } else {
                            Passageiro p = new Passageiro(nome, sexo, dataNascimento, email);
                            passageiros.add(p);
                            System.out.println("✅ Passageiro cadastrado com sucesso!");
                        }
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\n--- Passageiros Cadastrados ---");
                    for (Passageiro p : passageiros) {
                        System.out.println("Nome: " + p.getNome() + 
                                           " | Sexo: " + p.getSexo() + 
                                           " | Nascimento: " + sdf.format(p.getDataNascimento()) + 
                                           " | Email: " + p.getEmail());
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }

    private static boolean existeEmail(String email) {
        for (Passageiro p : passageiros) {
            if (p.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }
}
