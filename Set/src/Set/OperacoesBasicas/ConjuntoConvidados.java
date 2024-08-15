package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        
        
        conjuntoConvidados.adicionarConvidado("Matheus", 2535);
        conjuntoConvidados.adicionarConvidado("Carlos", 2638);
        conjuntoConvidados.adicionarConvidado("Pedro",    2535);
        conjuntoConvidados.adicionarConvidado("Telma", 9432);

        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.removerConvidadoPorCodigoConvite(2638);
        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();
    }
}
