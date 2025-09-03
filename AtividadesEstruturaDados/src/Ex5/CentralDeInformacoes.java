package Ex5;

import java.util.ArrayList;

public class CentralDeInformacoes {
    private ArrayList<Passageiro> todosOsPassageiros = new ArrayList<>();
    private ArrayList<Corrida> todasAsCorridas = new ArrayList<>();

    public boolean adicionarPassageiro(Passageiro p) {
        for (Passageiro existente : todosOsPassageiros) {
            if (existente.getId().equals(p.getId())) {
                return false; // já existe
            }
        }
        return todosOsPassageiros.add(p);
    }

    public boolean adicionarCorrida(Corrida c) {
        for (Corrida existente : todasAsCorridas) {
            if (existente.getId() == c.getId()) {
                return false; // não pode ter mesmo ID
            }
        }
        return todasAsCorridas.add(c);
    }

    public Corrida recuperarCorridaPeloId(long id) {
        for (Corrida c : todasAsCorridas) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Corrida> recuperarCorridasDeUmPassageiro(String idPassageiro) {
        Passageiro passageiroEncontrado = null;
        for (Passageiro p : todosOsPassageiros) {
            if (p.getId().equals(idPassageiro)) {
                passageiroEncontrado = p;
                break;
            }
        }
        if (passageiroEncontrado == null) {
            return null; // passageiro não existe
        }

        ArrayList<Corrida> corridasDoPassageiro = new ArrayList<>();
        for (Corrida c : todasAsCorridas) {
            if (c.getPassageiro().getId().equals(idPassageiro)) {
                corridasDoPassageiro.add(c);
            }
        }
        return corridasDoPassageiro;
    }

    public ArrayList<Corrida> getTodasAsCorridas() {
        return todasAsCorridas;
    }

    public ArrayList<Passageiro> getTodosOsPassageiros() {
        return todosOsPassageiros;
    }
}
