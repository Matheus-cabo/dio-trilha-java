import java.util.Scanner;
import java.util.Locale;
import

public class E {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome e sobrenome:");
            String nomeCompleto = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();
        
            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();
        }
        catch (inputMismatchException e){

        }
    }
}
