package Ex2;

public class Main {
    public static void main(String[] args) {
        CentralDeInformacoes central = new CentralDeInformacoes();

        Passageiro p1 = new Passageiro("João Silva", "joao@email.com", 25);
        Passageiro p2 = new Passageiro("Maria Souza", "maria@email.com", 17);
        Passageiro p3 = new Passageiro("Pedro Lima", "joao@email.com", 30);

        System.out.println("Adicionando João: " + central.adicionarPassageiro(p1)); // true
        System.out.println("Adicionando Maria (menor de idade): " + central.adicionarPassageiro(p2)); // false
        System.out.println("Adicionando Pedro (e-mail repetido): " + central.adicionarPassageiro(p3)); // false

        Passageiro encontrado = central.recuperarPassageiroPeloEmail("joao@email.com");
        if (encontrado != null) {
            System.out.println("Passageiro encontrado: " + encontrado.getNome());
        } else {
            System.out.println("Passageiro não encontrado.");
        }
    }
}
