import java.util.Scanner;

public class VerificacaoChequeEspecial1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu saldo Atual: ");
        double saldo = scanner.nextDouble();
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("Valor do saque: ");
        double saque = scanner.nextDouble();
        System.out.println("Valor sacado: " + saque);
        saldo = saldo - saque;
        System.out.println("Saldo Atual :" + saldo);
        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;
        double novo_Saldo = saldo + limiteChequeEspecial;
        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transacao realizada com sucesso.");
        }else if (saque >= saldo && saque <=novo_Saldo) {
             
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        }else{
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }    
            
         
            // TODO: Verificar se o saque ultrapassa o limite do cheque especial
            
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
        

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
