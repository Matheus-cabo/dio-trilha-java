package Map.Pesquisa2;

import java.util.Map;
import java.util.HashMap;
public class ContagemPalavras {
    
    Map<String, Integer> contagemPalavraMap;

    public ContagemPalavras(){
        this.contagemPalavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavraMap.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        if(!contagemPalavraMap.isEmpty())
        contagemPalavraMap.remove(palavra);
    }
    public int exibirContagemPalavras(){
       int contagemTotal = 0;
        for(int contagem : contagemPalavraMap.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }
    public String encontrarPalavraMaisFrequente(){
        String palavrafrequente =null;
        int maiorContagem = 0;
        if(!contagemPalavraMap.isEmpty()){
            for( Map.Entry<String, Integer> entry : contagemPalavraMap.entrySet()){
                if(entry.getValue() > maiorContagem){
                    maiorContagem =entry.getValue();
                    palavrafrequente = entry.getKey();
                }
            }
        }
        return palavrafrequente;
    }
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("java", 5);
        contagemPalavras.adicionarPalavra("Python", 3);
        contagemPalavras.adicionarPalavra("javaScript", 7);

        System.out.println(contagemPalavras.exibirContagemPalavras());

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
