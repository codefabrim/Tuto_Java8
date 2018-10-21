package tutoj8.concurrency.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 08.06.18
 * Time: 14:51
 * package : tutoj8.concurrency.ExecutorService
 * Responsability of classe :
 */
public class ZooInfo {

    public static void main(String[] args) {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();  //
           // service = Executors.new.newSingleThreadExecutor();



            System.out.println("Begin");
            service.execute(()-> System.out.println("printing zoo inventory"));

            service.execute(()->{for (int i = 0; i<3; i++)
                System.out.println("Printing record: " + i);
                ;});

            service.execute(()-> System.out.println("Printing zoo inventory"));
            System.out.println("End");




        }   finally {

            if (service != null) service.shutdown();
        }

    }
}
