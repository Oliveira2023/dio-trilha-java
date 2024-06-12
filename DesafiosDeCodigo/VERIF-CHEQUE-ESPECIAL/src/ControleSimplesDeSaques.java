import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Digite o limite diario de saque: ");
        double limiteDiario = scanner.nextDouble();
        double valorSacado = 0;
        double valorSaque[] = new double[5];
        boolean parar = false;

        // TODO: Crie um loop 'for' para iterar sobre os saques:
        for (int i = 0; limiteDiario > 0; i++) {

            // TODO: Solicite ao usuário o valor do saque:
            System.out.println("Digite o valor do saque: ");
            valorSaque[i] = scanner.nextDouble();
            // TODO: Verifique se o valor do saque é zero, encerrando as transações:
            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
            if (valorSaque[i] == 0) {
                System.out.println("Transacoes encerradas. ");
                break;
                // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            }else if (valorSaque[i] > limiteDiario) {
                System.out.println("Limite excedido. Transacoes encerradas.");
                break;
            }else {
                limiteDiario -= valorSaque[i];
                // TODO: Informe que o saque foi realizado e mostre o limite restante:
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }
            // Fechamos o Scanner para evitar vazamento de recursos:
            scanner.close(); 
    }
}