package Map.OperacoesBasicas;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato(){
        if(!agendaContatoMap.isEmpty()){
            System.out.println(agendaContatoMap);
        }else{
            System.out.println("O ");
        }    
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Matheus", 985687741);
        agendaContatos.adicionarContato("Felipe", 987456322);
        agendaContatos.adicionarContato("Felipe", 987456325);
        agendaContatos.adicionarContato("Marcos", 987456321);
        agendaContatos.adicionarContato("Leandro", 987456323);

        //agendaContatos.exibirContato(); 
        agendaContatos.removerContato("Leandro");  
        agendaContatos.exibirContato();
        System.out.println("O nome é: " + agendaContatos.pesquisarPorNome("Matheus"));
    }

}
