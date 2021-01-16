package srp;

import java.util.HashMap;


public class CarrinhoCompraBAD {
    private HashMap<String, Double> itens;
    private String status;
    private Double valorTotal;


    public CarrinhoCompraBAD() {
        this.itens = new HashMap<>();
        this.status = "Aberto";
        this.valorTotal = 0.0;
    }

    public HashMap<String, Double> exibirItens(){
        return this.itens;
    }

    public void adicionarItem(String item, Double valor) {
        valorTotal += valor;
        itens.put(item, valor);
    }

    public Double valorTotal() {
        return this.valorTotal;
    }

    public String exibirStatus() {
        return this.status;
    }

    public Boolean confirmarPedido() {
        if(this.validarCarrinho()) {
            this.status="Confirmado";
            this.enviaEmailConfirmacao();
            return true;
        } else return false;
    }

    public void enviaEmailConfirmacao() {
        System.out.println("...envia email de confirmação");
    }

    public Boolean validarCarrinho() {
        return this.itens.size()>0;
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "itens=" + itens +
                ", status='" + status + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
