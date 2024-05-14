
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {

        try {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo" + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ", tenho" + idade + "anos, minha altura é" + altura + "m, e eu sou muito" + (idade >= 18 ? "velho" : "novo") + ".");    
        scanner.close();
    } catch (InputMismatchException e) {
        System.out.println("Os campos idade e altura precisam ser numéricos");
    }
    }
}
