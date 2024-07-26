package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando a Entrada dos Itens");
    }
    private void controlarSaida(){
        System.out.println("Controlando a Saída dos Itens");
    }
    void entregarIngredientes(){
        System.out.println("Entregando  Ingredientes");
        controlarSaida();
    }
    void trocarGas(){
        System.out.println("Almoxarife trocando Gás");
    }
}
