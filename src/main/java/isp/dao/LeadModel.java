package isp.dao;

import isp.BD;
import isp.componentes.Log;
import isp.componentes.Notificacao;
import isp.interfaces.ICadastro;
import isp.interfaces.INotificacao;

public class LeadModel extends BD implements ICadastro, INotificacao {
    @Override
    public void salvar() {

    }

    @Override
    public void enviarNotificacao(Notificacao notificacao) {

    }
}
