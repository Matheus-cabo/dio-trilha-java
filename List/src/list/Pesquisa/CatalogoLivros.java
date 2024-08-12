package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    List<Livro> listLivro;

    public CatalogoLivros(){
        this.listLivro = new ArrayList<>();
    }

    public void adicionarLivros(String titulo,String autor, int anoPublicacao){
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        listLivro.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> pesquisarAutor = new ArrayList<>();
        if(!listLivro.isEmpty()){
            for(Livro l : listLivro){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    pesquisarAutor.add(l);
                    
                }
            }
        }else{
            throw new RuntimeException("A lista está vazia");
        }
        return pesquisarAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> pesquisaIntervaloAno = new ArrayList<>();
        if(!listLivro.isEmpty()){
            for(Livro l : listLivro){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    pesquisaIntervaloAno.add(l);
                    
                }
            }
            
        }else{
            throw new RuntimeException("A lista está vazia");
        }
        return pesquisaIntervaloAno;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!listLivro.isEmpty()){
            for(Livro l : listLivro){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }else{
            throw new RuntimeException("A lista está vazia");
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        
        // Criando uma instância do catálogo de livros
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    // Adicionando livros ao catálogo
    catalogoLivros.adicionarLivros("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivros("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivros("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivros("O Codificador Limpo", "Robert C. Martin", 2012);

    // Exibindo livros pelo mesmo autor
    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

    // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
    System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

    // Exibindo livros dentro de um intervalo de anos
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

    // Exibindo livros por título
    System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

    // Exibindo livros por título (caso em que não há livros com o título especificado)
    System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}
