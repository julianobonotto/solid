package dip;

public class Mensageiro {
    private IMensagemToken canal;

    public Mensageiro(IMensagemToken canal) {
        this.canal = canal;
    }

    public IMensagemToken getCanal() {
        return canal;
    }

    public void setCanal(IMensagemToken canal) {
        this.canal = canal;
    }

    public void enviarToken() {
        this.canal.enviar();
    }
}
