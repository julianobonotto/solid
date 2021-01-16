package srp;

public class Pedido {
    private String status;
    private CarrinhoCompra carrinhoCompra;
    private Double valorPedido;

    public Pedido() {
        this.status = "aberto";
        this.carrinhoCompra = new CarrinhoCompra();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CarrinhoCompra getCarrinhoCompra() {
        return carrinhoCompra;
    }

    public void setCarrinhoCompra(CarrinhoCompra carrinhoCompra) {
        this.carrinhoCompra = carrinhoCompra;
    }

    public Double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(Double valorPedido) {
        this.valorPedido = valorPedido;
    }

        public Boolean confirmar() {
        if(this.carrinhoCompra.validarCarrinho()) {
            this.setStatus("confirmado");
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "status='" + status + '\'' +
                ", carrinhoCompra=" + carrinhoCompra +
                ", valorPedido=" + valorPedido +
                '}';
    }
}
