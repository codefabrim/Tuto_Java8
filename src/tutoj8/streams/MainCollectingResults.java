package tutoj8.streams;

import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Oana on 24.04.2018.
 */
public class MainCollectingResults {
    public static void main(String[] args) {

        collectingUsingBasicBehavior();
        collectingIntoMaps();

   }

    private static void collectingIntoMaps() {
        System.out.println("MainCollectingResults.collectingIntoMaps");
        Stream<String> stream = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = stream.collect(Collectors.toMap(s-> s, s->s.length()));
        System.out.println("map = " + map);
    }

    private static void collectingUsingBasicBehavior() {
        System.out.println("MainCollectingResults.collectingUsingBasicBehavior");
        System.out.println("");
        System.out.println("");
        collectAndjoining();
    }

    private static void collectAndjoining() {
        System.out.println("MainCollectingResults.collectAndjoining");
        Stream<String> stream = Stream.of("lions", "tigers", "bears");
        String result = stream.collect(Collectors.joining("#"));
        System.out.println("result = " + result);

        calculateAverageLengthOfAnimal();
        inputCollectionNachOutputCollection();

    }

    private static void inputCollectionNachOutputCollection() {
        System.out.println("MainCollectingResults.inputCollectionNachOutputCollection: from a Collection " +
                                   "--> result of Typer Collection");
        Stream<String> stream = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result = stream
                    .filter(s->s.startsWith("b"))
                     .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("result = " + result);

    }

    private static void calculateAverageLengthOfAnimal() {
        System.out.println("MainCollectingResults.calculateAverageLengthOfAnimal)");
        Stream<String> stream = Stream.of("lions", "tigers", "bears");
        Double result = stream.collect(Collectors.averagingDouble(x->x.length()));
        System.out.println("result = " + result);

    }






}