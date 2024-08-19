package Map.Ordenacao2;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
public class Livro {
    
    private String titulo;
    private String autor;
    private double preco;
   
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
    }
    

    
}
class CompararPorPreco implements Comparator <Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }

   
    
    
}
class CompararPorAutor implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
      return l1.getValue().getAutor().compareTo(l2.getValue().getAutor());
    }

   
    
    
}   
