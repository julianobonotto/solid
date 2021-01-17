package ocp.extrator;

import ocp.DadosPessoa;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Txt extends Arquivo {

    public Txt() {
    }

    public void lerArquivo(String caminho) {

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
