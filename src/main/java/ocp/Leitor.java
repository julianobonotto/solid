package ocp;

import ocp.extrator.Arquivo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Leitor {
    private String diretorio;
    private String arquivo;

    public String getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public List<DadosPessoa> lerArquivo() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String caminho = this.getDiretorio()+this.getArquivo();
        Arquivo arquivo = new Arquivo();

        String extensao = caminho.substring(caminho.length() - 3);
        extensao = extensao.substring(0, 1).toUpperCase() + extensao.substring(1);


        Class<?> clazz = Class.forName("ocp.extrator."+extensao);
        Arquivo anyClassTxtCsv = (Arquivo) clazz.getDeclaredConstructor().newInstance();
        Method lerArquivo = clazz.getDeclaredMethod("lerArquivo", String.class);
        lerArquivo.invoke(anyClassTxtCsv, caminho);

        System.out.println("pause");

        return anyClassTxtCsv.getDados();
    }

}
