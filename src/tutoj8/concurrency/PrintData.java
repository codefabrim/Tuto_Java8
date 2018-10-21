package tutoj8.concurrency;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 08.06.18
 * Time: 14:33
 * package : tutoj8.concurrency
 * Responsability of classe :
 */
public class PrintData implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i<3; i++){
            System.out.println("Printing record: "+ i);
        }
    }


    public static void main(String[] args) {
        new Thread(new PrintData()).start();
    }

}
