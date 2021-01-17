package lsp;

public class MainLSP {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(5);
        retangulo.setLargura(10);
        System.out.println("Area retangulo = " + retangulo.getArea());

        Quadrado quadrado = new Quadrado();
        quadrado.setAltura(5);
        System.out.println("Area quadrado = " + quadrado.getArea());


        Retangulo retanguloFerido = new Quadrado();
        retanguloFerido.setAltura(5);
        retanguloFerido.setLargura(10);
        System.out.println("Area retanguloFerido = " + retanguloFerido.getArea());
    }
}
