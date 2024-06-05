import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        boolean fimDeSemana = true;
//        boolean fazendoSol = true;
//        boolean vamosAPraia = fimDeSemana && fazendoSol;
//        System.out.println(vamosAPraia);

//        int nota = 100;
//        String graduacao;
//
//        if (nota >= 80) {
//            graduacao = "A";
//        } else if (nota < 80 && nota >= 70) {
//            graduacao = "B";
//        } else if (nota < 70 && nota >= 60) {
//            graduacao = "C";
//        } else if (nota < 60 && nota >= 0) {
//            graduacao = "D";
//        }else {
//            graduacao = "";
//        }

//        switch (graduacao) {
//            case "A":
//            case "B":
//                System.out.println("Aluno Aprovado");
//                break; //Para o codigo ler o case e parar caso o bloco seja True
//            case "C":
//            case "D":
//                System.out.println("Aluno não aprovado");
//                break;
//            default:
//                System.out.println("Graduação Inválida");
//        }
        String nome = "Guilherme";

//        System.out.println(nome.equals(nomeOutro));
//        System.out.println(nome.equalsIgnoreCase(nomeOutro));

        //ISO 8601

        LocalDate hoje = LocalDate.now();
        String language = "pt";
        String country = "BR";
        Locale brazil = new Locale(language, country);
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brazil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brazil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());


    }
}