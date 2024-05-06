
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Oi, fui executao pelo terminal");
        // String nome = args[0];
        // String sobrenome = args[1];
        // int idade = Integer.parseInt(args[2]);
        // Double altura = Double.valueOf(args[3]);
        
         Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("US"));

        System.out.println("Digite seu nome: " );
        String nome = sc.nextLine();

        System.out.println("Digite seu sobrenome: " );
        String sobrenome = sc.nextLine();

        System.out.println("Digite sua idade: " );
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: " );
        double altura = sc.nextDouble();

        System.out.println(nome + " " + sobrenome + " " + idade + " " + altura);
    }
}
