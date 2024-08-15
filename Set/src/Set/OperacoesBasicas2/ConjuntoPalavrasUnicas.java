package Set.OperacoesBasicas2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    Set<String> palavraSet;

    public ConjuntoPalavrasUnicas(){
        this.palavraSet = new HashSet<>();
    }  
    
    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }
    public void removerPalavra(String palavra){

        if(!palavraSet.isEmpty()){
            if(palavraSet.contains(palavra)){
                palavraSet.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada no conjunto");
            }
        }else{
            throw new RuntimeException("O conjunto está vazia");
        }
    }
    public boolean verificarPalavra(String palavra){
        return palavraSet.contains(palavra);
    }
    public void exibirPalavrasUnicas(){
        if(!palavraSet.isEmpty()){
            System.out.println(palavraSet);
        }else{
            throw new RuntimeException("O conjunto está vazio");
        }
    }
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("Css");
        conjuntoPalavrasUnicas.adicionarPalavra("Html");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("Java");

        System.out.println("A palavra Java está no conjunto?" + conjuntoPalavrasUnicas.verificarPalavra("Java"));
        System.out.println("A palavra Python está no conjunto?" + conjuntoPalavrasUnicas.verificarPalavra("Python"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }    
}
