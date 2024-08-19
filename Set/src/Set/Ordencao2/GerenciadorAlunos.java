package Set.Ordencao2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    Set<Alunos> alunosSet;

    public GerenciadorAlunos(){
    this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }
    public void removerAluno(long matricula){
        Alunos removerPorMatricula = null;
        for(Alunos a : alunosSet){
            if(a.getMatricula() == matricula){
                removerPorMatricula = a;
                break;
            }
        }
        alunosSet.remove(removerPorMatricula);
    }
    public void exibirAlunosPorNome(){
        Set<Alunos> exibirPorNome = new TreeSet<>(alunosSet);
        if(!alunosSet.isEmpty()){
            System.out.println(exibirPorNome);
        }else{
            System.out.println("O conjunto está vazio");
        }
    }    
    public void exibirAlunosPorNota(){
        Set<Alunos> exibirPorNota = new TreeSet<>(new CompararPorNota());
        exibirPorNota.addAll(alunosSet);
        if(!alunosSet.isEmpty()){
            System.out.println(exibirPorNota);
        }else{
            System.out.println("O conjunto está vazio");
        }
    } 
    public void exibirAlunos(){
        if(!alunosSet.isEmpty()){
            System.out.println(alunosSet);
        }else{
            throw new RuntimeException("O conjunto está vazio");
        }
    }
    

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Matheus", 235469874L, 8.5);
        gerenciadorAlunos.adicionarAluno("Felipe", 235469874L, 5.0);
        gerenciadorAlunos.adicionarAluno("Jose", 235469873L, 4.3);
        gerenciadorAlunos.adicionarAluno("Caio", 235469872L, 2.5);
        gerenciadorAlunos.adicionarAluno("Luiz", 235469871L, 7.4);
        
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();
    }
    
}
