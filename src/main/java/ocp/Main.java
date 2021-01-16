package ocp;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Leitor leitorCSV = new Leitor();
        leitorCSV.setDiretorio("C:\\Users\\Juliano_Bonotto\\Desktop\\SOLID\\");
        leitorCSV.setArquivo("dados.csv");
        List<DadosPessoa> dadosArquivoCSV = leitorCSV.lerArquivo();

        Leitor leitorTXT = new Leitor();
        leitorTXT.setDiretorio("C:\\Users\\Juliano_Bonotto\\Desktop\\SOLID\\");
        leitorTXT.setArquivo("dados.txt");
        List<DadosPessoa> dadosArquivoTXT = leitorTXT.lerArquivo();

        List<DadosPessoa> todosRegistros = new ArrayList<>();
        todosRegistros.addAll(dadosArquivoCSV);
        todosRegistros.addAll(dadosArquivoTXT);


        System.out.println("pause");
    }
}
