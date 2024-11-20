package Set.Ordenacao;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    
    Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    } 
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> nomeProduto = new TreeSet<>(produtoSet);
        return nomeProduto;
    }  
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> precoProduto = new TreeSet<>(new CompararPorPreco());
        precoProduto.addAll(produtoSet);
        return precoProduto;
    }
    public static void main(String[] args) {
        
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(147258369, "Mouse", 15.30, 3);
        cadastroProdutos.adicionarProduto(147258368, "Teclado", 85, 2);
        cadastroProdutos.adicionarProduto(147258367, "Monitor", 86.98, 5);
        cadastroProdutos.adicionarProduto(147258366, "Headset", 23.36, 1);
        cadastroProdutos.adicionarProduto(147258366, "Processador", 365.60, 1);
        
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        //System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}    
