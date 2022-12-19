public class Usuario {
    public static void main(String[] args) {
        SmartTv smarTv = new SmartTv();

        System.out.println("Canal atual : " +smarTv.canal);

        smarTv.mudarCanal(13);

        System.out.println("Canal atual : " +smarTv.canal);

        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.diminuirVolume();
        System.out.println("O volume atual da TV: " + smarTv.volume);

        System.out.println("TV Ligada ? " + smarTv.ligada);
        System.out.println("Canal Atual : " + smarTv.canal);
        System.out.println("Volume atual : " + smarTv.volume);

        smarTv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smarTv.ligada);
    }
}
