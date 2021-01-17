package lsp;

import lsp.poligonos.Retangulo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Poligono {
    private Object forma;

    public Object getForma() {
        return forma;
    }

    public void setForma(Object forma) {
        this.forma = forma;
    }

    public Integer getArea() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method getAltura = this.getForma().getClass().getDeclaredMethod("getAltura");
        Object altura = getAltura.invoke(this.getForma());

        Method getLargura = this.getForma().getClass().getDeclaredMethod("getLargura");
        Object largura = getLargura.invoke(this.getForma());

        return (Integer) altura * (Integer) largura;

    }
}
