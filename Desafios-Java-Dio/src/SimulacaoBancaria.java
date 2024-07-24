import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        Boolean continuar = true;
        
        
        

        while (continuar) {
            
            
            int opcao = scanner.nextInt();  
            
            
            
            switch (opcao) {
                case 1:
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Saldo Atual: " + saldo);
                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    if (saque >saldo){
                        System.out.println("Saldo Insuficiente");
                    }else{
                        saldo = saldo - saque;
                        System.out.println ("Saldo atual: " + saldo);
                    }                 
                    break;                   
                case 3:                   
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa Encerrado.\n");
                    continuar = false;
                default:
                    System.out.println("Opcção inválida. Tente Novamente.");
            }
        }scanner.close();    
    }
}    