package ocp.extrator;

import java.io.*;

public class Xls extends Arquivo{

        public void lerArquivo(String caminho) {

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
}
