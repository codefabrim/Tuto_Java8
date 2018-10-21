package patterns;

import java.util.List;

/**
 * Create immutable Object Animal.
 * Problem: How do we create read only objects that can  be shared and used  by multiple classes
 *
 * 1. #use a constructor to set all properties of the object
 * 2. Mark all of the instance variable private and final
 * 3. Don't define any setter methods
 * 4. Don't allow refernced mutable objects to be modified or accessed directly
 * 5. prevent method from being overriden
 *
 */
public final class Animal {
    private final List<String> favoriteFoods;

    public Animal(List<String> favoriteFoods) {
        if (favoriteFoods == null){
            throw  new RuntimeException("FAvorite Foods is required");

        }


        this.favoriteFoods = favoriteFoods;
    }


}
