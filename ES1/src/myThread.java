public class myThread extends Thread{

    String name;
    int sleepMs;

    public myThread(String name, int sleepMs) {
        this.name = name;
        this.sleepMs = sleepMs;
    }


    @Override
    public void run() {

        System.out.println("["+name+"]"+ " ms : " + sleepMs);
        try {
            sleep(sleepMs);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("["+name+"] TERMINATO" );

    }
}
