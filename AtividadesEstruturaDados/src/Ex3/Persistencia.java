package Ex3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Persistencia {

    public static void salvarCentral(CentralDeInformacoes central, String nomeArquivo) {
        try {
            XStream xstream = new XStream(new DomDriver());
            FileWriter escritor = new FileWriter(new File(nomeArquivo));
            escritor.write(xstream.toXML(central));
            escritor.close();
            System.out.println("Central salva em " + nomeArquivo);
        } catch (Exception e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public static CentralDeInformacoes recuperarCentral(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            if (!arquivo.exists()) {
                System.out.println("Arquivo não encontrado. Criando nova Central.");
                return new CentralDeInformacoes();
            }
            XStream xstream = new XStream(new DomDriver());
            FileReader leitor = new FileReader(arquivo);
            CentralDeInformacoes central = (CentralDeInformacoes) xstream.fromXML(leitor);
            leitor.close();
            System.out.println("Central recuperada de " + nomeArquivo);
            return central;
        } catch (Exception e) {
            System.out.println("Erro ao recuperar: " + e.getMessage());
            return new CentralDeInformacoes();
        }
    }
}

