package tutoj8.streams.myotherlambda;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 04.05.18
 * Time: 11:26
 * package : tutoj8.streams.myotherlambda
 * Responsability of classe :
 */
public class MainZertifizierung {


    public static void main(String[] args) {

        Zertifizierung zertifJava6 = new Zertifizierung("Java 6", true, "66");
        System.out.println(pruefenZertifi(zertifJava6, x -> x.isSucced()));

        Zertifizierung zertifJava8 = new Zertifizierung("Java 8", false, "66");
                System.out.println(pruefenZertifi(zertifJava8, x -> x.isSucced()));

    }


    public static  boolean pruefenZertifi(Zertifizierung z, IPredicateZertifiziert predicateZertifiziert) {
        if (predicateZertifiziert.testZertif(z)) {

            return true;
        }
        return false;
    }

}


