package lsp.poligonos;

import lsp.Poligono;

public class Quadrado extends Poligono {
    private Integer largura;
    private Integer altura;

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
        this.altura = largura;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
        this.largura = altura;
    }
}
