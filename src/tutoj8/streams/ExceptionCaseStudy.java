package tutoj8.streams;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Oana on 24.04.2018.
 */
public class ExceptionCaseStudy {

    private static List<String> create() throws IOException{

        throw new IOException();
    }


    public static void main(String[] args) {
        System.out.println("ExceptionCaseStudy.main: problrm de RuntimeException Attendu " +
                                   "par la lambda Supplier par exemple attends RuntimeExption");
        //create().stream().count();
        Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;
        System.out.println(s2.get().stream().count());

    }

    public static List<String> createSafe(){
        try {
            return  create();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
