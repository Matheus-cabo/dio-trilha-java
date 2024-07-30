package Apps;
public class MSNMessenger extends ServicoMensagemInstatanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        ConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
        salvarHistoricoMensagem();
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando historica da mensagem pelo Mensseger");
    }
}
