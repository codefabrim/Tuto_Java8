package vorstellungges;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 17.05.18
 * Time: 12:19
 * package : vorstellungges
 * Responsability of classe :
 */
public class MainVorstell {


    public static void main(String[] args) {

        mymethod();


    }

    private static void mymethod() {

        try {
            //boolean  hasX = "fderwg".contains("X");

            String s = "tehrjtu";
            throw new Exception("dfwegrhjk");

        } catch (Exception e) {
            System.out.println("****> in Exception = " + true);
            e.printStackTrace();
        } finally {
            System.out.println("---> in finally = " + true);
        }

        System.out.println("++++> ausser try/catch/finally = " + true);

    }
}
