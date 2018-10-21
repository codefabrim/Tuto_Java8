package tutoj8.streams.chap2.functinterface;

/**
 * Created by Oana on 25.04.2018.
 */
public class FindMatchingAnimals {

    public static void main(String[] args) {

     //   print(new Animal("fisch", false, true), a -> a.canHop());
        print(new Animal("fisch", false, true) , a -> a.isCanSwim());
        print(new Animal("kangoroo", true, false) , a -> a.isCanHop());
    }

    private static void print(Animal a, ICheckTrait trait) {
        if (trait.test(a))
            System.out.println("a = " + a);

    }


}




