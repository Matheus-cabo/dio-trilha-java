package Map.OperacoesBasicas2;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if(dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }
    public void exibirPalavras(){
        if(!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }else{
            System.out.println("O conjunto está vazio");
        }
    }
    public String pesquisarPorPalavra(String palavra){
        String dicionarioPalavra = null;
        if(!dicionarioMap.isEmpty()){
            dicionarioPalavra = dicionarioMap.get(palavra);
        }
        return dicionarioPalavra;
    }
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        dicionario.removerPalavra("kotlin");
        dicionario.exibirPalavras();
        System.out.println("Definiçao da linguagem java: " + dicionario.pesquisarPorPalavra("java"));
    }
}
