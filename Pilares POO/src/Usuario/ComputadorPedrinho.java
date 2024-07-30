package Usuario;
import Apps.FacebookMessenger;
import Apps.MSNMessenger;
import Apps.ServicoMensagemInstatanea;
import Apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstatanea smi = null;
       /*
            NÃO SE SABE QUAL APP
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER
        */
        String appEscolhido = "fbm";

        if (appEscolhido.equals("msn")){
            smi = new MSNMessenger();          
        }else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();           
        }else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();       
        }
        smi.enviarMensagem();
        smi.receberMensagem();
        
    }   
}