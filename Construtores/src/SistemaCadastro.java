public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Marcos","123");
        //definimos o endereço de marcos
        marcos.setEndereco("Ruas das Marias");
        //e como definir o nome e cpf do marcos?

        //imprimindo o marcos sem o nome e cpf
        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
