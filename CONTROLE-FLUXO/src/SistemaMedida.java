public class SistemaMedida {
    
    public static void main(String[] args) {
        
        String sigla = "P";

        switch (sigla) {
            case "M" :
            System.out.println("Medio");
            break;

            case "G" :
            System.out.println("Grande");
            break;

            case "P" :
            System.out.println("Pequeno");
            break;

            default:
            System.out.println("Indefinido");
        }
    }
}