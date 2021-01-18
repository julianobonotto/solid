package dip;

import java.lang.reflect.InvocationTargetException;

public class MainDIP {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Mensageiro mensageiro = new Mensageiro(new Email());
        mensageiro.enviarToken();

        Mensageiro mensageiro2 = new Mensageiro(new Sms());
        mensageiro2.enviarToken();


        Mensageiro mensageiro3 = new Mensageiro(new Whatsapp());
        mensageiro3.enviarToken();
    }
}
