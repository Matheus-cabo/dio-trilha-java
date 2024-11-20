package Map.Ordenacao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class LivrariaOnline {
    
    Map<String, Livro> livroMap;

    public LivrariaOnline(){
        this.livroMap = new HashMap<>();
    }
    public void adicionarLivro(String link, String titulo, String autor,double preco){
        livroMap.put(link, new Livro(titulo, autor, preco));
    }
    public void removerLivro(String titulo){
        List <String> chavesRemover =  new ArrayList<>();
        for(Map.Entry<String, Livro> entry : livroMap.entrySet()){
            if(entry.getValue().getTitulo().equals(titulo)){
                chavesRemover.add(entry.getKey());
            }
        }
        for(String chave: chavesRemover){
            livroMap.remove(chave);
        }
        
    }


    public Map<String,Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosparaOrdenarPreco = new ArrayList<>(livroMap.entrySet());
        Collections.sort(livrosparaOrdenarPreco, new CompararPorPreco());
        
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
       
        for (Map.Entry<String,Livro> entry : livrosparaOrdenarPreco){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;

    }
    public Map<String,Livro> exibirLivrosOrdenadosPorAutor(){
         List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livroMap.entrySet());
         Collections.sort(livrosParaOrdenarPorAutor, new CompararPorAutor());

         Map<String,Livro> livroOrdenadosPorAutor = new LinkedHashMap<>();

         for(Map.Entry<String,Livro> entry : livrosParaOrdenarPorAutor){
            livroOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
         }
         return livroOrdenadosPorAutor;
    }
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livroPorAutor = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : livroMap.entrySet()){
            if(entry.getValue().getAutor().equals(autor)){
                livroPorAutor.put(entry.getKey(), entry.getValue());
            }

        }
        return livroPorAutor;
    }
     public List<Livro> obterLivroMaisCaro() {
    List<Livro> livrosMaisCaros = new ArrayList<>();
    double precoMaisAlto = Double.MIN_VALUE;

    if (!livroMap.isEmpty()) {
      for (Livro livro : livroMap.values()) {
        if (livro.getPreco() > precoMaisAlto) {
          precoMaisAlto = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }

    for(Map.Entry<String, Livro> entry: livroMap.entrySet()) {
      if(entry.getValue().getPreco() == precoMaisAlto) {
        Livro livroComPrecoMaisAlto = livroMap.get(entry.getKey());
        livrosMaisCaros.add(livroComPrecoMaisAlto);
      }
    }
    return livrosMaisCaros;
  }

  public List<Livro> obterLivroMaisBarato() {
    List<Livro> livrosMaisBaratos = new ArrayList<>();
    double precoMaisBaixo = Double.MAX_VALUE;

    if (!livroMap.isEmpty()) {
      for (Livro livro : livroMap.values()) {
        if (livro.getPreco() < precoMaisBaixo) {
          precoMaisBaixo = livro.getPreco();
        }
      }
    } else {
      throw new NoSuchElementException("A livraria está vazia!");
    }

    for(Map.Entry<String, Livro> entry: livroMap.entrySet()) {
      if(entry.getValue().getPreco() == precoMaisBaixo) {
        Livro livroComPrecoMaisBaixo = livroMap.get(entry.getKey());
        livrosMaisBaratos.add(livroComPrecoMaisBaixo);
      }
    }
    return livrosMaisBaratos;
  }


    public void exibirLivros(){
      System.out.println(livroMap);
    }
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("www.com.br", "YOU", "João cabral de melo", 85.90);
        livrariaOnline.adicionarLivro("www.com.br.acess", "O melhor de mim", "Alex Monteiro", 65.90);
        livrariaOnline.adicionarLivro("www.leight.com", "Nós", "Dutra Leão", 45.90);
        livrariaOnline.adicionarLivro("www.mais.ais.com", "Eles", "Dutra Leão", 30.90);
        livrariaOnline.adicionarLivro("www.louther.com", "Corra", "Marcio Galvão", 90.90);

        
        //livrariaOnline.removerLivro("YOU");
        //livrariaOnline.exibirLivros();

        //livrariaOnline.exibirLivrosOrdenadosPorPreco();
        //System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Dutra Leão"));
        System.out.println(livrariaOnline.obterLivroMaisBarato());
    }
}
