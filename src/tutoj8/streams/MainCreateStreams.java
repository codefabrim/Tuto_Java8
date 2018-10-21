package tutoj8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Oana on 20.04.2018.
 */
public class MainCreateStreams {
    public static void main(String[] args) {
        // write your code here
        Stream<String> empty = Stream.empty();
        System.out.println("MainCreateStreams.main " + empty.count());


        Stream<String> troisElements = Stream.of("Certification", "1ZO-813", "Java 8 Upgrade");
        System.out.println("taille de troisElements  " + troisElements.count());

        Stream<Integer> fromArrayde3 = Stream.of(1, 2, 3 );
        System.out.println("taille de fromArrayde3 " + fromArrayde3.count());


        //convert from a list  into a Streams
        List<String> list = Arrays.asList("Salut" ,"je suis ...", " a Aaachen", "nous sommes en 2018");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();
        System.out.println("taille de fromList " + fromList.count());
        System.out.println("taille de fromListParallel " + fromListParallel.count());


    }
}
