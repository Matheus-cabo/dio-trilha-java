package list.Ordenação2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    
    List<Integer> numerosList;

    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numeroAscendente = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(numeroAscendente);
            return numeroAscendente;
        }else{
            throw new RuntimeException("A lista está vazia");
        }    
    }  
    public List<Integer> ordenarDescendente() {
        List<Integer> numeroDescendente = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()){
            numeroDescendente.sort(Collections.reverseOrder());
            return numeroDescendente;
        }else{
            throw new RuntimeException("A lista está vazia");
        }    
    }   
    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            System.out.println(numerosList);
        }else{
            System.out.println("A lista está vazia");
        }
    }
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(58);
        ordenacaoNumeros.adicionarNumero(10);
        
        //ordenacaoNumeros.exibirNumeros();
        System.out.println("Descendente: " + ordenacaoNumeros.ordenarDescendente());
        System.out.println("Ascendente: " + ordenacaoNumeros.ordenarAscendente());

    } 
}   
