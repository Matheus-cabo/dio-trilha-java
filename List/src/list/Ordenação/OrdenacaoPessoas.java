package list.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    
    List<Pessoa> listPessoa;

    public OrdenacaoPessoas() {
        this.listPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        Pessoa list =  new Pessoa(nome, idade, altura);
        listPessoa.add(list);
    }
    
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorAltura, new CompararPorAltura());
        return pessoasPorAltura;
    }
    public static void main(String[] args) {
        
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Matheus", 18, 1.85);
        ordenacaoPessoas.adicionarPessoa("Felipe", 32, 1.65);
        ordenacaoPessoas.adicionarPessoa("Lucas", 45, 1.95);
        ordenacaoPessoas.adicionarPessoa("Mario", 85, 1.97);

        //System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
       
    }
}  
