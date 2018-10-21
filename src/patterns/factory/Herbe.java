package patterns.factory;

/**
 * Created by Oana on 25.04.2018.
 */
public class Herbe extends Food {

        public Herbe(int qty) {
            super (qty);

        }

        @Override
        public void consumed() {
            System.out.println("Herbe eaten = " + getQuantity());
        }
    }
