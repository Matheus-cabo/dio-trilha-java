package Exemplo1;
public class Carro extends Veiculo {
    
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Combustível");
    }
    private void confereCambio(){
        System.out.println("Conferindo Cambio em P");
    }
}
