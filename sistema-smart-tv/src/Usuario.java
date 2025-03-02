public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();        

        System.out.println("Novo Volume: " + smartTv.volume);

        smartTv.mudarCanal(76);
        smartTv.mudarCanal(131);
        smartTv.mudarCanal(59);

        smartTv.diminuirCanal();
        

    }
}
