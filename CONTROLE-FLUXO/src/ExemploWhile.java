
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada) {break;}// iguala o valor do doce com o valor da mesada, pra dar uma conta zerada.
                
                System.out.println("Doce de valor: " + valorDoce + ", adicionado no carrinho");
                mesada = mesada - valorDoce;
        }
        System.out.println("Mesada restante: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    private static double valorAleatorio() {
        
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
