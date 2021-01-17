package ocp;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class MainOCP {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Leitor leitorCSV = new Leitor();
        leitorCSV.setDiretorio("C:\\Users\\Juliano_Bonotto\\Desktop\\SOLID\\");
        leitorCSV.setArquivo("dados.csv");
        List<DadosPessoa> dadosArquivoCSV = leitorCSV.lerArquivo();

        Leitor leitorTXT = new Leitor();
        leitorTXT.setDiretorio("C:\\Users\\Juliano_Bonotto\\Desktop\\SOLID\\");
        leitorTXT.setArquivo("dados.txt");
        List<DadosPessoa> dadosArquivoTXT = leitorTXT.lerArquivo();

        Leitor leitorXLS = new Leitor();
        leitorXLS.setDiretorio("C:\\Users\\Juliano_Bonotto\\Desktop\\SOLID\\");
        leitorXLS.setArquivo("dados.xls");
        List<DadosPessoa> dadosArquivoXLS = leitorXLS.lerArquivo();

        List<DadosPessoa> todosRegistros = new ArrayList<>();
        todosRegistros.addAll(dadosArquivoCSV);
        todosRegistros.addAll(dadosArquivoTXT);
        todosRegistros.addAll(dadosArquivoXLS);


        System.out.println("pause");
    }
}
