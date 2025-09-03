package Ex3;

public class Main {
    public static void main(String[] args) {
        String arquivo = "central.xml";

        // Criando Central e adicionando passageiros
        CentralDeInformacoes central = new CentralDeInformacoes();
        central.adicionarPassageiro(new Passageiro("Cauê", "123.456.789-00"));
        central.adicionarPassageiro(new Passageiro("Felipe", "987.654.321-00"));

        // Salvando a central
        Persistencia.salvarCentral(central, arquivo);

        // Recuperando a central
        CentralDeInformacoes centralRecuperada = Persistencia.recuperarCentral(arquivo);

        // Exibindo passageiros recuperados
        for (Passageiro p : centralRecuperada.getTodosOsPassageiros()) {
            System.out.println(p);
        }
    }
}
