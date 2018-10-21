package patterns.factory;

/**
 * Created by Oana on 25.04.2018.
 */
public class FoodFactory {

    public static Food getFood(String animalName){

        switch (animalName){
            case "zebra" : return new Herbe(100);
            case "rabbit" : return new Paille(5);
            case "hamster" : return new Paille(100);
            case "ours" : return new Fisch(10);

        }
        throw new UnsupportedOperationException("Unsupported Animal "+ animalName);

    }
}
