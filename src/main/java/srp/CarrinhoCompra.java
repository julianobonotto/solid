package srp;

import java.util.HashMap;
import java.util.Map;


public class CarrinhoCompra {
    private HashMap<String, Double> itens = new HashMap<>();

    public HashMap<String, Double> getItens() {
        return this.itens;
    }

    public void adicionarItem(Item item) {
        this.itens.put(item.getDescricao(), item.getValor());
    }

    public Boolean validarCarrinho() {
        return this.itens.size() > 0;
    }

    public Double valorTotalItens() {
        Double valorTotal = 0.0;
        for(Map.Entry<String, Double> item : itens.entrySet()) {
            valorTotal += item.getValue();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "itens=" + itens +
                '}';
    }
}
