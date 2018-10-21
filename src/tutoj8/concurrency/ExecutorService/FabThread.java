package tutoj8.concurrency.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 08.06.18
 * Time: 15:22
 * package : tutoj8.concurrency.ExecutorService
 * Responsability of classe :
 */
public class FabThread {

    public static void main(String[] args) {
        ExecutorService service = null;

        try{
            //create Executor service with Executors
            service = Executors.newSingleThreadExecutor();
            //service = Executors.newCachedThreadPool() ;     // for Performance +++

            System.out.println("Begin");
            //run executor service  with execute(Runnable)
            service.execute(()->{
                for (int i =0; i<3; i++)
                System.out.println("service = " + i);
            });


            System.out.println("End");
        }  finally {

            if (service != null) service.shutdown();
        }

    }
}
