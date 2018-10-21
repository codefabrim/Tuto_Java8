package patterns.factory;

/**
 * Created by Oana on 25.04.2018.
 */
public class Paille extends Food {

        public Paille(int qty) {
            super (qty);

        }

        @Override
        public void consumed() {
            System.out.println("Herbe eaten = " + getQuantity());
        }
    }
