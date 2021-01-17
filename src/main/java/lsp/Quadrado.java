package lsp;

public class Quadrado extends Retangulo {
    @Override
    public void setLargura(Integer largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }

    @Override
    public void setAltura(Integer altura) {
        super.setAltura(altura);
        super.setLargura(altura);
    }
}
