package tutoj8.concurrency.ExecutorService;

import java.util.concurrent.*;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 08.06.18
 * Time: 16:10
 * package : tutoj8.concurrency.ExecutorService
 * Responsability of classe :
 */
public class CheckResult {
    private static int counter= 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            Future<?> result = service.submit(()-> {
                for (int i = 0; i<3; i++)  CheckResult.counter ++;
            }) ;

            //result.get (5, TimeUnit.SECONDS);
            result.get (2, TimeUnit.NANOSECONDS);  //get the result of the Future Object if available within a Timeout of 2 nanasecond
            System.out.println("Reached!");


        } catch (Exception e) {
            System.out.println("Not Reached in time!");
            e.printStackTrace();
        } finally {
            if (service != null) service.shutdown();
        }


    }
}
