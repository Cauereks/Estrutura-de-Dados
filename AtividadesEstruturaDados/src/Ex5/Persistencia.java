package Ex5;

import java.io.*;
import com.thoughtworks.xstream.XStream;

public class Persistencia {
    private static final String ARQUIVO = "central.xml";

    public static void salvarCentral(CentralDeInformacoes central) {
        XStream xstream = new XStream();
        try {
            FileOutputStream fos = new FileOutputStream(ARQUIVO);
            ObjectOutputStream oos = xstream.createObjectOutputStream(fos);
            oos.writeObject(central);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static CentralDeInformacoes recuperarCentral() {
        XStream xstream = new XStream();
        try {
            FileInputStream fis = new FileInputStream(ARQUIVO);
            ObjectInputStream ois = xstream.createObjectInputStream(fis);
            CentralDeInformacoes central = (CentralDeInformacoes) ois.readObject();
            ois.close();
            return central;
        } catch (Exception e) {
            return new CentralDeInformacoes();
        }
    }
}

