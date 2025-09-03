package Ex3;

import java.io.Serializable;
import java.util.ArrayList;

public class CentralDeInformacoes implements Serializable {
    private ArrayList<Passageiro> todosOsPassageiros = new ArrayList<>();

    public void adicionarPassageiro(Passageiro p) {
        todosOsPassageiros.add(p);
    }

    public ArrayList<Passageiro> getTodosOsPassageiros() {
        return todosOsPassageiros;
    }
}
