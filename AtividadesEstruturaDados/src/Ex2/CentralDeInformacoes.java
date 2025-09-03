package Ex2;

import java.util.ArrayList;

public class CentralDeInformacoes {
    private ArrayList<Passageiro> todosOsPassageiros;

    public CentralDeInformacoes() {
        this.todosOsPassageiros = new ArrayList<>();
    }

    public boolean adicionarPassageiro(Passageiro p) {
        // Verifica idade mínima
        if (p.getIdade() < 18) {
            return false;
        }

        // Verifica se já existe passageiro com mesmo e-mail
        for (Passageiro existente : todosOsPassageiros) {
            if (existente.getEmail().equalsIgnoreCase(p.getEmail())) {
                return false;
            }
        }

        // Adiciona passageiro
        todosOsPassageiros.add(p);
        return true;
    }

    public ArrayList<Passageiro> getTodosOsPassageiros() {
        return todosOsPassageiros;
    }

    public void setTodosOsPassageiros(ArrayList<Passageiro> lista) {
        this.todosOsPassageiros = lista;
    }

    public Passageiro recuperarPassageiroPeloEmail(String email) {
        for (Passageiro p : todosOsPassageiros) {
            if (p.getEmail().equalsIgnoreCase(email)) {
                return p;
            }
        }
        return null;
    }
}

