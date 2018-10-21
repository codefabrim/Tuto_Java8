package tutoj8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Oana on 24.04.2018.
 */
public class MainAroundPipeline {

    public static void main(String[] args) {

        puttingTogether();
        testTeilStream();


    }

    private static void testTeilStream() {

        System.out.println("MainAroundPipeline.testTeilStream");
        List<String> list = Arrays.asList("Toby","Anna", "Leroy","Alex");

        Stream<String> stream = list.stream();
          stream.limit(2)
                  .sorted()
                  .forEach(System.out::println);

    }

    private static void puttingTogether() {
        System.out.println("MainAroundPipeline.puttingTogether");
        List<String> list = Arrays.asList("toby","anna", "Leroy","Alex");

        Stream<String> stream = list.stream();

        stream.filter(x->x.length() == 4)
                .peek(x-> System.out.println("filtered : "+  x))
                .sorted()
                .forEach(System.out::println);


    }




}
