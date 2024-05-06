public class Usuario {
    /**
     * Esta classe representa um usuário do sistema de tv.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /** 
         * Cria uma instância da classe SmartTv.
         * Imprime o status inicial da tv.
         * Liga a tv e aumenta o volume.
         * Imprime o novo status.
         */
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
     
        smartTv.ligar();
        smartTv.aumentarVolume();
        System.out.println("Novo Staus -> Tv ligada ? " + smartTv.ligada);
        System.out.println("Volume Atual: " + smartTv.volume);
        
    }
}
