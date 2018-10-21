package testenthuware;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 04.05.18
 * Time: 15:34
 * package : testenthuware
 * Responsability of classe :
 */
public class MainLambdaTest {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 4, 6,8);

        list.forEach(x->x = x+1);
        //list.forEach(x->System.out.println(x = x+1));


        list.forEach(System.out::println);



    }
}

