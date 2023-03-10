import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random in = new Random();
        Scanner inp = new Scanner(System.in);
        int nCasse;


        System.out.println("Numero delle casse: ");
        nCasse = inp.nextInt();

        for (int i = 0;  Cassa.biglietti> 0; i++){
            int nBiglietti = in.nextInt(4)+1;
            Cassa c = new Cassa("T"+i,nBiglietti);
            c.run();
        }

    }
}
