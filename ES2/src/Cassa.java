public class Cassa implements Runnable{

    public static int biglietti = 200;
    private int prenotati;
    private String nomeCassa;

    public Cassa(String nomeCassa, int prenotati) {
        this.nomeCassa = nomeCassa;
        this.prenotati = prenotati;
    }


    @Override
    public synchronized void run(){

        if (prenotati > 0){
            biglietti-=prenotati;
            System.out.println("["+nomeCassa+"] "+ prenotati + " [BIGLIETTI ATTUALI: " + biglietti + "]");
        }else{
            prenotati = 0;
            System.out.println("Non ci sono posti disponibili");
        }
    }
}
