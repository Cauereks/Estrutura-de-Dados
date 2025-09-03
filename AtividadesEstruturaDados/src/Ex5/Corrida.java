package Ex5;

public class Corrida {
    private long id;
    private String enderecoPartida;
    private String enderecoDestino;
    private Passageiro passageiro;

    public Corrida() {
        this.id = System.currentTimeMillis();
    }

    public Corrida(String enderecoPartida, String enderecoDestino, Passageiro passageiro) {
        this.id = System.currentTimeMillis();
        this.enderecoPartida = enderecoPartida;
        this.enderecoDestino = enderecoDestino;
        this.passageiro = passageiro;
    }

    public long getId() { return id; }
    public Passageiro getPassageiro() { return passageiro; }

    @Override
    public String toString() {
        String genero = passageiro.getSexo().equalsIgnoreCase("F") ? "pede para pegá-la" : "pede para pegá-lo";
        return passageiro.getNome().split(" ")[0] + " " + genero + " em " + enderecoPartida;
    }
}
