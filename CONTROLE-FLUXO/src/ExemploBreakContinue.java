public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 10; numero++) {
            if(numero == 5) {
                break; // encerra o laço
            }
            System.out.println(numero);
        }
    }
}
