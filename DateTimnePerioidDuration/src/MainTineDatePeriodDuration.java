import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 11.05.18
 * Time: 09:47
 * package : DAteTimePeriodDuration
 * Responsability of classe :
 */
public class MainTineDatePeriodDuration {

    public void mmyMethod(){

        Library classeUnderTest;
        classeUnderTest = new Library();
        classeUnderTest.
    }



    public static void main(String[] args) {
       // System.out.println("Period.ofMonths(3) = " + Period.ofMonths(3));




        //ChonoUnit
        LocalTime one = LocalTime.of(5, 15);
        LocalTime two = LocalTime.of(6,30);

        System.out.println("ChronoUnit.HOURS.between");

        System.out.println(ChronoUnit.HOURS.between(one, two));

        System.out.println("ChronoUnit.MINUTES.between");
        System.out.println(ChronoUnit.MINUTES.between(one, two));



    }

}
