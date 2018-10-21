import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Oana on 24.04.2018.
 */
public class MainStreamPrimitive {

    public static void main(String[] args) {
        calculatesumofInt();
        calculateAnAverage();

        creatingprimitiveStream();
        summarizingStatistics();
    }

    private static void summarizingStatistics() {
        System.out.println("GEt max und the min a serie of number");
        IntStream ints = IntStream.of(1,2,3,4,5,6,7,8,9);

        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        int res =  stats.getMax() - stats.getMin();
        System.out.println("res = " + res);

    }

    private static void calculateAnAverage() {
        System.out.println("MainStreamPrimitive.calculateAnAverage");
        IntStream intStream = IntStream.of(43, 36, 4);
        OptionalDouble avg = intStream.average();
        avg.ifPresent(System.out::println);
    }

    private static void calculatesumofInt() {
        System.out.println("MainStreamPrimitive.calculatesumofInt");
        Stream<Integer> stream = Stream.of(2018, -1982, 0, 0);
        System.out.println(stream.reduce(0, (a,b)->(a+b)));

        Stream<Integer> streamInt = Stream.of(1,2,3);
        System.out.println(streamInt.mapToInt(x->x).sum());
    }


    private static void creatingprimitiveStream() {
        System.out.println("MainStreamPrimitive.creatingprimitiveStream");
        Stream <String> stream = Stream.of("Fabrice Jean-Luc", "Oana-Eugenia", "Ines Anne-Marie");
        IntStream is = stream.mapToInt(x-> x.length());
        is.forEach(System.out::println);
    }


}
