package Ex5;

public class Passageiro {
    private String id;
    private String nome;
    private String sexo; // "M" ou "F"
    private String email;

    public Passageiro(String id, String nome, String sexo, String email) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getSexo() { return sexo; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return nome + " (" + id + ")";
    }
}

