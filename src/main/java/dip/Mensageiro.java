package dip;

import ocp.extrator.Arquivo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Mensageiro {
    private String canal;

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public void enviarToken() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName("dip."+canal);
        Object canal = clazz.getDeclaredConstructor().newInstance();
        Method enviar = clazz.getDeclaredMethod("enviar");
        enviar.invoke(canal);

//        Email email = new Email();
//        email.enviar();
    }
}
