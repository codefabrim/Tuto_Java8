package patterns.factory;

/**
 * Created by Oana on 25.04.2018.
 */
public class Fisch extends Food {


    public Fisch(int qty) {
        super (qty);

    }




    @Override
    public void consumed() {
        System.out.println("FIsh eaten = " + getQuantity());
    }
}
