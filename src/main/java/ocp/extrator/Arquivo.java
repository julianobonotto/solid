package ocp.extrator;

import ocp.DadosPessoa;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    private List<DadosPessoa> dados = new ArrayList<>();

    protected void setDados(String nome, String cpf, String email) {
        DadosPessoa dadosPessoa = new DadosPessoa();
        dadosPessoa.setNome(nome);
        dadosPessoa.setCpf(cpf);
        dadosPessoa.setEmail(email);

        dados.add(dadosPessoa);
        System.out.println("pause");

    }

    public List<DadosPessoa> getDados() {
        return dados;
    }

}
