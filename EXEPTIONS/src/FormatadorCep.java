public  class FormatadorCep {

    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("1234567");
        }catch (CepInvalidoException e){
            System.out.println(e.getMessage());
        }
        


    }
    static String formatarCep(String cep) throws CepInvalidoException{
            
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        System.out.println("Formatando Cep...");
        return  "23.765-064";
    }
}