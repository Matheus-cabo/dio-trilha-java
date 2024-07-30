package Apps;
public class Telegram extends ServicoMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        ConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando historica da mensagem pelo Telegram");
    }
}
