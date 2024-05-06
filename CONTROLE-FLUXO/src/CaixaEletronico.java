public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 26;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo disponível: R$" + saldo);
        } else if (valorSolicitado == saldo) {
            System.out.println("Saque saldo total realizado com sucesso!");
        }else {
            System.out.println("Saldo insuficiente");
        }

    }
}
