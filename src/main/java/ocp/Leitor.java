package ocp;

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

    public List<DadosPessoa> lerArquivo() {
        String caminho = this.getDiretorio()+this.getArquivo();
        Arquivo arquivo = new Arquivo();
        String extensao = caminho.substring(caminho.length() - 3);

        if (extensao.equals("txt")) arquivo.lerArquivoTXT(caminho);
        if (extensao.equals("csv")) arquivo.lerArquivoCSV(caminho);

        return arquivo.getDados();
    }

}
