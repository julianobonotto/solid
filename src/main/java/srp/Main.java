package srp;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        Item item1 = new Item();
        Item item2 = new Item();

        item1.setDescricao("copo");
        item1.setValor(4.55);

        item2.setDescricao("Lamp");
        item2.setValor(8.55);

        pedido.getCarrinhoCompra().adicionarItem(item1);
        pedido.getCarrinhoCompra().adicionarItem(item2);
        pedido.setValorPedido(pedido.getCarrinhoCompra().valorTotalItens());
        System.out.println("pedido valido? " + pedido.getCarrinhoCompra().validarCarrinho());
        pedido.confirmar();

        System.out.println("--------------------------");
        System.out.println(pedido);
        System.out.println("--------------------------");



//        CarrinhoCompra carrinho = new CarrinhoCompra();
//        carrinho.adicionarItem("bike", 750.10);
//        carrinho.adicionarItem("gela", 1950.10);
//        carrinho.adicionarItem("Tapete", 350.10);
//        if (carrinho.confirmarPedido()) System.out.println("pedido realizado com sucesso");
//        else System.out.println("Erro no pedido");
//
//        System.out.println(carrinho.toString().toString());
    }
}
