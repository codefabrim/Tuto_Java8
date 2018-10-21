package tutoj8.streams.chap2.functinterface;

import java.util.function.Predicate;

/**
 * Created by Oana on 25.04.2018.
 */
@FunctionalInterface
public interface ICheckTrait extends Predicate<Animal> {

    public boolean test(Animal a);
}
