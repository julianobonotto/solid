package lsp;

public class Retangulo {
    private Integer largura;
    private Integer altura;

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getArea() {
        return this.largura * this.altura;
    }
}
