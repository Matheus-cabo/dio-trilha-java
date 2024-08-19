package Map.Ordenacao;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.time.LocalDate;
import java.time.Month;

public class AgendaEventos {
     
    Map<LocalDate, Evento> eventoMap;

    public AgendaEventos(){
        this.eventoMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }
    public void obterProximoEvento(){
        //Set<LocalDate> dateSet = eventoMap.keySet();
        //Collection<Evento> values = eventoMap.values();
        //eventoMap.get();
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + "Acontecerá na data " + proximaData);
                break;
            }
        }
            
    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 5), "Evento1", "Atração1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 6), "Evento2", "Atração2");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JANUARY, 5), "Evento3", "Atração3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 19), "Evento4", "Atração4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 25), "Evento5", "Atração5");

        //agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

}
