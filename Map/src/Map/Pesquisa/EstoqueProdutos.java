package Map.Pesquisa;

import java.util.Map;
import java.util.HashMap;
public class EstoqueProdutos {
    
    Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos(){
        this.estoqueProdutoMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto( nome,  quantidade,  preco));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getEstoqueTotal();
            }    
        }
        return valorTotalEstoque;        
    }
    public Produto obterProdutoMaisCaro(){
        Produto valorMaisCaro =null;
        double caro =0;
        if(!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() > caro){
                    valorMaisCaro = p;
                    caro = p.getPreco();
                }
            }
        }
        return valorMaisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto valorMaisBarato =null;
        double barato = 0;
        if(!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() < barato || barato == 0){
                    valorMaisBarato = p;
                    barato = p.getPreco();
                }
            }
        }
        return valorMaisBarato;
    }
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getEstoqueTotal() > maiorValorTotalProdutoEstoque) {
                produtoMaiorQuantidadeValorNoEstoque = p;
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }
    
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(885, "Mouse", 3, 5.29);
        estoqueProdutos.adicionarProduto(886, "Teclado", 2, 24.90);
        estoqueProdutos.adicionarProduto(887, "Monitor", 5, 70.90);
        estoqueProdutos.adicionarProduto(888, "Headset", 9, 69.90);

       // estoqueProdutos.exibirProdutos();

        //System.err.println(estoqueProdutos.calcularValorTotalEstoque());

        //System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        

    }

}
