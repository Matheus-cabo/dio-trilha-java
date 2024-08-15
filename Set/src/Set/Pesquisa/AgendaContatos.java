package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for(Contato c : contatoSet){
                if(c.getNome().startsWith(nome)){
                    contatoPorNome.add(c);
                }
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public void exibirContatos(){
        if(!contatoSet.isEmpty()){
            System.err.println(contatoSet);
        }else{
            System.err.println("A agenda está vazio");
        }
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        
        agendaContatos.adicionarContato("Matheus", 985687741);
        agendaContatos.adicionarContato("Matheus", 985687751);
        agendaContatos.adicionarContato("Marcos Antonio", 988053824);
        agendaContatos.adicionarContato("Marcos", 994218436);

        
        

        System.out.println("Atualizando contato:" + agendaContatos.atualizarNumeroContato("Marcos", 986305822));
        agendaContatos.exibirContatos();
        
        

    }
}
