package ocp;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    private List<DadosPessoa> dados = new ArrayList<>();

    private void setDados(String nome, String cpf, String email) {
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

    public void lerArquivoCSV(String caminho) {

        String linha = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(caminho), "ISO-8859-1"));
            linha = br.readLine();
            while (linha != null) {

                String[] fields = linha.split(";");
                setDados(fields[0], fields[1], fields[2]);
                linha = br.readLine();

            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("pausa");
    }

    public void lerArquivoTXT(String caminho) {

        Path file = Paths.get(caminho);
        Charset charset = Charset.defaultCharset();

        try {
            Files.lines(file, charset)
                    .filter(line -> line.length() != 142)
                    .forEach(line -> {
                        DadosPessoa record = new DadosPessoa();
                        setDados(
                                line.substring(11, 30).trim(),
                                line.substring(0, 11).trim(),
                                line.substring(30).trim()
                        );

                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
