package isp.dao;

import isp.BD;
import isp.componentes.Log;
import isp.componentes.Notificacao;
import isp.interfaces.ICadastro;
import isp.interfaces.ILog;
import isp.interfaces.INotificacao;

public class UsuarioModel extends BD implements ICadastro, ILog, INotificacao {
    @Override
    public void salvar() {

    }

    @Override
    public void registrarLog(Log log) {

    }

    @Override
    public void enviarNotificacao(Notificacao notificacao) {

    }
}
