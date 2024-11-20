package Apps;
public class MSNMessenger extends ServicoMensagemInstatanea {

    
    public void enviarMensagem() {
        validarConectadoInternet();
        ConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
        salvarHistoricoMensagem();
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando historica da mensagem pelo Mensseger");
    }
}
