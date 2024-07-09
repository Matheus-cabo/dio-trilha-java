public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
   
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void volumeAumentar(){
        volume ++;
        System.out.println("Aumentando Volume para:" + volume);
    }

    public void volumeDiminuir(){
        volume --;
        System.out.println("Diminuindo Volume para:" + volume);
    }

    public void canalAumentar(){
        canal++;
    }

    public void canalDiminuir(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
