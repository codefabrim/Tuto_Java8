package patterns.factory;

/**
 * Created by Oana on 25.04.2018.
 *
 *
 * Problem: how create objects in wich  the precise type of the object may not be known until runtime
 *
 *
 */
public class MainZooKeeper {
    public static void main(String[] args) {
        final Food food = FoodFactory.getFood("zebra");
        food.consumed();
    }
}
