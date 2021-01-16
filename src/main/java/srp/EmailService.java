package srp;

public class EmailService {
    private String de;
    private String para;
    private String assunto;
    private String conteudo;

    public EmailService() {
        this.de = "contato@site.com.br";
    }

    public static String dispararEmail() {
        return "...envia email";
    }
}
