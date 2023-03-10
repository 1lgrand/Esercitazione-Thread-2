import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        int nThread;
        int i;
        Random r = new Random();

        System.out.println("Inserisci il numero di thread: ");
        nThread = in.nextInt();

        for (i=0;i<nThread;i++){
            myThread thread = new myThread("T"+i,r.nextInt(5001));
            //thread.join();
            thread.start();

        }



        System.out.println("FINITO TUTTO");


    }
}