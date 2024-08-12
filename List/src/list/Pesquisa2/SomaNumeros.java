package list.Pesquisa2;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                soma += numero;
            }
        }
        return soma;
    }
    public int encontrarMaiorNumero(){
        int maior = 0;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if( numero > maior){
                    maior = numero;
                }
            }

        }
        return maior;
    }
    public int encontrarMenorNumero(){
        int menor = 0;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                if( menor == 0 || numero < menor){
                    menor = numero;
                }
            }

        }
        return menor;
    }
    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(numeros);
        }else{
            System.out.println("A lista está vazia");
        }
    }
    public static void main(String[] args) {
        
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(2);

        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Maior numero: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());
        
        somaNumeros.exibirNumeros();
    }
}
