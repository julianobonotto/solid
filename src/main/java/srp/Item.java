package srp;

public class Item {
    private String descricao;
    private Double valor;

    public Item() {
        this.descricao = "";
        this.valor = 0.0;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
