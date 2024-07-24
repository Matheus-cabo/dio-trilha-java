import java.util.Scanner;

public class SimulacaoBancaria2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        double deposito = 0;
        double saque = 0;
        
        

        while (continuar) {
            System.out.println("Digite 1 para deposito");
            System.out.println("Digite 2 para saque");
            System.out.println("Digite 3 para exibir saldo");
            
            int opcao = scanner.nextInt();  
            
            
            
            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor do deposito");
                    deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Saldo Atual: " + saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Digite o valor do saque");
                    saque = scanner.nextDouble();
                    if (saque>saldo){
                        System.out.println("Saldo Insuficiente");
                    }
                    else{
                        saldo = saldo - saque;
                    }  
                    System.out.println ("Saldo atual: " + saldo);
                    break;
                    
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa Encerrado");
                    continuar = false;
                default:
                    System.out.println("Opcção inválida. Tente Novamente.");
            }
        }
        scanner.close();   
    }
}    