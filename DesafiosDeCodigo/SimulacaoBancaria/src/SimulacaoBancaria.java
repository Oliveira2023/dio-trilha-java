
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        boolean sair = false;

        while (!sair) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar saldo");
            System.out.println("0. Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Opção 1 - Digite o valor do deposito:");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo + "\n");
                    // break;
                }
                
                case 2 -> {
                    System.out.println("Opção 2 - Digite o valor do saque:");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente" + "\n");
                    }else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso");
                        System.out.println("Saldo atual: " + saldo + "\n");
                    }
                    break;
                }
                case 3 -> {
                    System.out.println("Saldo atual: " + saldo + "\n");
                    break;
                }
                case 0 -> {
                    System.out.println("Programa encerrado");
                    scanner.close();
                    sair = true;
                    
                    break;
                }
                default -> System.out.println("Opção inválida");
            }
        }
        
        
    }

}