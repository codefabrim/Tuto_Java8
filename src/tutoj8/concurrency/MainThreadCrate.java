package tutoj8.concurrency;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 08.06.18
 * Time: 14:28
 * package : tutoj8.concurrency
 * Responsability of classe :
 */
public class MainThreadCrate {

    public static void main(String[] args) {

        System.out.println("Begin " );

        new REadInvenoryThread().start();

        new Thread(new PrintData()).start();

        new REadInvenoryThread().start();
        System.out.println("End");

    }
}
