package Set.Pesquisa2;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        if(!tarefaSet.isEmpty()){
            for(Tarefa t : tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemover =t;
                }
            }
        }else{
            System.out.println("O conjunto está vazio");
          }
        tarefaSet.remove(tarefaRemover);
        if(tarefaRemover == null){
            System.out.println("O conjunto está vazio");
        }
    }
    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);

        }else{
            throw new RuntimeException("O conjunto está vazio");        
        }
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefaConcluida = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.isConcluida()){
                tarefaConcluida.add(t);
            }
        }
        return tarefaConcluida; 
    } 
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefaNaoConcluida = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(!t.isConcluida()){
                tarefaNaoConcluida.add(t);
            }
        }
        return tarefaNaoConcluida; 
    }  
    
    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
            }
        }
    }
    public void limparListaTarefas() {
        if(tarefaSet.isEmpty()) {
          System.out.println("A lista já está vazia!");
        } else {
          tarefaSet.clear();
        }
    }
    public static void main(String[] args) {
        
        ListaTarefas listaTarefas =  new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa1");
        listaTarefas.adicionarTarefa("Tarefa2");
        listaTarefas.adicionarTarefa("Tarefa3");
        listaTarefas.adicionarTarefa("Tarefa4");

        
        System.out.println(listaTarefas.obterTarefasPendentes());
        
        listaTarefas.marcarTarefaConcluida("Tarefa1");
        listaTarefas.marcarTarefaConcluida("Tarefa2");
        listaTarefas.marcarTarefaConcluida("Tarefa3");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Tarefa1");
        listaTarefas.marcarTarefaPendente("Tarefa3");
        System.out.println(listaTarefas.obterTarefasPendentes());

        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
