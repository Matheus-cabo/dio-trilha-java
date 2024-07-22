public class FormatadorCepExemplo {
    public static void main(String[] args) {
       try {
        String cepFormatado = formatarcep("237650");
        System.out.println(cepFormatado);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        System.out.println("O cep não corresponde as regras de negocio ");
    }
    }
    static String formatarcep(String cep) throws CepInvalidoException{
        if (cep.length()!=8)
            throw new CepInvalidoException();

            return "23.765-064";
    }
}
