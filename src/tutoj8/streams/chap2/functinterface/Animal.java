package tutoj8.streams.chap2.functinterface;

/**
 * Created by Oana on 25.04.2018
 * .
 */
public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;


    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }


    public boolean isCanHop() {
        return canHop;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return species;
    }
}


