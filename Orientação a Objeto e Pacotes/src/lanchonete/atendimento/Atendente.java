package lanchonete.atendimento;

public class Atendente {
    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("Servindo Mesa");      
    }
    private void pegarLancheCozinha(){
        System.out.println("Pegando o Lanche na Cozinha");
    }
    public void receberPagamento(){
        System.out.println("Recebendo Pagamento");
    }
    void trocarGas(){
        System.out.println("Atendente");
    }
    private void pegarPedidoBalcao(){
        System.out.println("Pegando o Pedido no Balcão");
    }
}
