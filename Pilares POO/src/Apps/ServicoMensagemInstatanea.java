package Apps;
public abstract class ServicoMensagemInstatanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //mais um metodo que todos os filhos deverão implementar
    protected abstract void salvarHistoricoMensagem();
        
            
    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado");
    }
    protected void ConectadoInternet(){
        System.out.println("Conectado");
    }
    protected void DesconectadoInternet(){
        System.out.println("Desconectado");
    }

}
