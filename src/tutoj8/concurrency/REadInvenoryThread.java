package tutoj8.concurrency;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 08.06.18
 * Time: 14:36
 * package : tutoj8.concurrency
 * Responsability of classe :
 */
public class REadInvenoryThread extends Thread {
    public void run(){
        System.out.println("Ptintng zoo inventory");
    }


    public static void main(String[] args) {
        new REadInvenoryThread().start();
    }
}
