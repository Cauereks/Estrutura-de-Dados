package Ex4;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class Persistencia {
    private static final String ARQUIVO = "central.xml";

    public static void salvarCentral(CentralDeInformacoes central) throws Exception {
        XStream xstream = new XStream(new DomDriver());
        FileWriter escritor = new FileWriter(ARQUIVO);
        xstream.toXML(central, escritor);
        escritor.close();
    }

    public static CentralDeInformacoes recuperarCentral() throws Exception {
        File arquivo = new File(ARQUIVO);
        if (!arquivo.exists()) {
            return new CentralDeInformacoes(); // se não existir arquivo, retorna vazio
        }
        XStream xstream = new XStream(new DomDriver());
        FileReader leitor = new FileReader(arquivo);
        CentralDeInformacoes central = (CentralDeInformacoes) xstream.fromXML(leitor);
        leitor.close();
        return central;
    }
}
