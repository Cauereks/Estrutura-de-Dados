package Ex4;

import java.util.ArrayList;

public class CentralDeInformacoes {
    private ArrayList<Passageiro> todosOsPassageiros;

    public CentralDeInformacoes() {
        this.todosOsPassageiros = new ArrayList<>();
    }

    public boolean adicionarPassageiro(Passageiro p) {
        // Evita cadastro duplicado de CPF
        for (Passageiro passageiro : todosOsPassageiros) {
            if (passageiro.getCpf().equals(p.getCpf())) {
                return false; // Já existe passageiro com esse CPF
            }
        }
        todosOsPassageiros.add(p);
        return true;
    }

    public ArrayList<Passageiro> listarPassageiros() {
        return todosOsPassageiros;
    }

    public Passageiro buscarPassageiroPorCPF(String cpf) {
        for (Passageiro passageiro : todosOsPassageiros) {
            if (passageiro.getCpf().equals(cpf)) {
                return passageiro;
            }
        }
        return null; // não encontrado
    }
}

