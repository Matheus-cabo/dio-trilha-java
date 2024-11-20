public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        System.out.println("Tv ligada?" + smartTv.ligada);
        System.out.println("Volume atual:" + smartTv.volume);
        System.out.println("Canal Atual:" + smartTv.canal);

        smartTv.ligar ();
        System.out.println("Novo status -> TV ligada?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv Ligada?" + smartTv.ligada);

        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeAumentar();
        smartTv.volumeDiminuir();
        System.out.println("Volume atual em:" + smartTv.volume);

        smartTv.mudarCanal(9);
        

        smartTv.canalAumentar();
        System.out.println("Canal atual:" + smartTv.canal);
    } 
    
}
