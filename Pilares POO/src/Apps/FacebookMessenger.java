package Apps;
public class FacebookMessenger extends ServicoMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        ConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando historica da mensagem pelo Facebook");
    }
}