package lsp;

import lsp.poligonos.PoligonFantasy;
import lsp.poligonos.Quadrado;
import lsp.poligonos.Retangulo;

import java.lang.reflect.InvocationTargetException;

public class MainLSP {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        Poligono poligonoRet = new Poligono();
        poligonoRet.setForma(new Retangulo());
        poligonoRet.getForma();
        ((Retangulo) poligonoRet.getForma()).setAltura(5);
        ((Retangulo) poligonoRet.getForma()).setLargura(10);
        System.out.println("Area retangulo = " + poligonoRet.getArea());


        Poligono poligonoQad = new Poligono();
        poligonoQad.setForma(new Quadrado());
        poligonoQad.getForma();
        ((Quadrado) poligonoQad.getForma()).setAltura(5);
        System.out.println("Area quadrado = " + poligonoQad.getArea());

        Poligono poligonFantasy = new Poligono();
        poligonFantasy.setForma(new PoligonFantasy());
        poligonFantasy.getForma();
        System.out.println("Area poligonoFantasy = " + poligonFantasy.getArea());
    }
}
