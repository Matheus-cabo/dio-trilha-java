import java.util.Scanner;

public class contador {
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        int contagem = parametroDois -  parametroUm;
        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
            
        }else{
            for(int contando=1; contando <= contagem; contando++){
                System.out.println("Imprimindo o número: " + contando);
            }
            
        }
        
        
        
        //realizar o for para imprimir os números com base na variável contagem
    }
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println(("Digite o segundo parâmetro: "));
        int parametroDois = terminal.nextInt();

        try {
            
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e ) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
        }
        
    }
}
