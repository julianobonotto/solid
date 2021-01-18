package dip;

import java.lang.reflect.InvocationTargetException;

public class MainDIP {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Mensageiro mensageiro = new Mensageiro();
        mensageiro.setCanal("Email");
        mensageiro.enviarToken();

        Mensageiro mensageiro2 = new Mensageiro();
        mensageiro2.setCanal("Sms");
        mensageiro2.enviarToken();


        Mensageiro mensageiro3 = new Mensageiro();
        mensageiro3.setCanal("Whatsapp");
        mensageiro3.enviarToken();
    }
}
