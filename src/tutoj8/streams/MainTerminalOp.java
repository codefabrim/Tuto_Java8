package tutoj8.streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Oana on 22.04.2018.
 */
public class MainTerminalOp {

    public static void main(String[] args) {

//       create Stream
        Stream<String> animal  = Stream.of("Lion",  "Chien","Elephant", "Cat");

//        find animal with fewest letter

        System.out.println("\n* min() /max(): find animal with fewest letter");
        Optional<String> m = animal.min((a1, a2) -> a1.length() - a2.length());
             m.ifPresent(System.out::println);



//    findAny() : give  just  one element of a list

        System.out.println("\n* findAny() : give  just  one element of a list");
        Stream<String> animal4findAny  = Stream.of("Lion",  "Chien","Elephant", "Cat");
//      Optional<String> optFindAny = animal4findAny.findAny().ifPresent();
        animal4findAny.findAny().ifPresent(System.out::println);

        //with a infinite Stream
        Stream<String> infinite = Stream.generate(()->"chimp");
        infinite.findAny().ifPresent(System.out::println);


//    allMatch(), anyMatch() and noneMatch() : anim,al names with specific letter
        System.out.println("\n* allMatch(), anyMatch() and noneMatch() : animal names with specific letter");

        List<String> list = Arrays.asList("monkey", "2", "chimpanze");
//        Stream<String>

        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred));   //true

        System.out.println(list.stream().allMatch(pred));   ///false  a cause du "2"

        System.out.println(list.stream().noneMatch(pred));  //false


//        forEach: example print all elent of Stream
        System.out.println("\n* forEach: example print all element of Stream");

        List<String> listing  = Arrays.asList("sql", "java8", "jpa", "security", "devops");
        Stream<String> slisting = listing.stream();
        slisting.forEach(System.out::println);



//        reduce : example concatenate letter into a String
        System.out.println("\n* reduce : example concatenate letter into a String");

        Stream<String> stream4concat = Stream.of("c", "e","r","t","i","f");
        String word = stream4concat.reduce("", (s,c) -> (s+c));
        System.out.println(word);


//       same  with a method reference

        Stream<String> stream4concatMethRef = Stream.of("c", "e","r","t","i","f","i");
        String resWord = stream4concatMethRef.reduce("", String::concat);
        System.out.println(resWord);


        Stream<Integer> streamInteger = Stream.of(3, 5, 6);
        System.out.println(streamInteger.reduce(1, (a, b) -> (a*b)));



        //        collect : mutable reduction  -->
        System.out.println("\n* collect : mutable reduction  ");

        Stream<String> stream4Collect = Stream.of("c", "e","r","t","i","f","i");
        //String resWordFromCollect =
        // stream4Collect.collect(StringBuilder:: new,
        // StringBuilder::append, StringBuilder::appendAll);

        tutoCollect();
        intermediateMethode();

    }


    public static void tutoCollect(){
        System.out.println("\n* collect : mutable reduction  ");
        //System.out.println("MainTerminalOp.tutoCollect");
        Stream<String> stream = Stream.of("fab", "rice");

        StringBuilder name = stream.collect(
                StringBuilder :: new,
                StringBuilder :: append,
                StringBuilder :: append);
        System.out.println("name = " + name);
        System.out.println("name = " + name);


        System.out.println("MainTerminalOp.tutoCollect  --> example with TreeSet");

        Stream<String> stream1 = Stream.of("f", "a","b","r","i","c","e");
        TreeSet<String> set = stream1.collect(TreeSet::new, TreeSet::add,
                                              TreeSet::addAll);
        System.out.println("set = " + set);


        Stream<String>  inputIban = Stream.of("d","e","4","9","1","0","0","5");
        TreeSet verarbeitetIban = inputIban.collect(Collectors.toCollection(TreeSet::new));
        //String verarbeitetIban = inputIban.collect(Collectors.toCollection(String::new));
        System.out.println("verarbeitetIban = " + verarbeitetIban);

    }


    public static void intermediateMethode(){
        System.out.println("MainTerminalOp.intermediateMethode");

        filterMethod();
        distinctMethod();
        limitAndSkipMethod();
        mapMethod();
        flatMapMethod();
        advancedFlatMapMethod();
        SortedMethod();
        peekMetho();



       }
    public static void filterMethod(){
        //System.out.println("Filter method");
        System.out.println("\n* Filter method");
        Stream<String>  stream = Stream.of("certidf Sql","certif  java 8 ", "hibernate", "securite", "database", "datenvbank", "hello");
        stream.filter(x->x.startsWith("h"))
                .forEach(System.out::println);



    }
    public static void distinctMethod(){
        System.out.println("\n* distinct Method");

        Stream<String> s = Stream.of("java", "java", "sql","sql","devOps");
        s.distinct().forEach(System.out::println);
    }
    public static void limitAndSkipMethod(){
        System.out.println("\n* limitAndSkip method");
        //Stream<String> s = Stream.of("java", "java", "sql","sql","devOps");
        Stream<String>  stream = Stream.of("certidf Sql","certif  java 8 ", "hibernate",
                                           "securite", "database", "datenvbank", "hello");
        stream.skip(2)
                .limit(4).forEach(System.out::println);

    }
    public static void mapMethod(){
        System.out.println("\n* map method : return la taille de chaque mot");

        Stream<String>  stream = Stream.of("certidf Sql","certif  java 8 ", "hibernate",
                                           "securite", "database", "datenvbank", "hello");
                         stream.map(String::length)
                                 .forEach(System.out::println);


    }

    public static void flatMapMethod(){
        System.out.println("\n* FlatMap method :  ");

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Jenkins");
        List<String>  two = Arrays.asList("java 6", "Oracle sql fondamental" );
        List<String>  third = Arrays.asList("java 8", "JPA" , "DevOps");

        Stream<List<String>> certifs = Stream.of(zero, one, two, third);
        certifs.flatMap(l->l.stream())
                .forEach(System.out::println);


    }

    public static void advancedFlatMapMethod(){
        System.out.println("\n*   +*********************Advnced FlatMap method **********************:  ");

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Jenkins");
        List<String>  two = Arrays.asList("java 6", "Oracle sql fondamental" );
        List<String>  third = Arrays.asList("java 8", "JPA" , "DevOps");

        List<List<String>> listofListA = new ArrayList<List<String>>();
        listofListA.add(two);
        listofListA.add(one);

        List<List<String>> listofListB = new ArrayList<List<String>>();
        listofListB.add(zero);
        listofListB.add(third);


        Stream <List<List<String>>> certifs = Stream.of(listofListB, listofListA);
        certifs.flatMap(l->l.stream())
                .forEach(System.out::println);


    }
    public static void SortedMethod(){
        System.out.println("\n* Sorted  method");
        Stream<String>  stream = Stream.of("certif Sql","certif  java 8 ", "hibernate",
                                           "securite", "database", "datenvbank", "hello");

        stream.sorted()
                .forEach(s-> System.out.println("s = " + s));


        System.out.println("\n* Sorted  method :   with ComparatorreverOrder ");
        Stream<String>  stream4reverseOrder = Stream.of("certif Sql","certif  java 8 ", "hibernate",
                                                        "securite", "database", "datenvbank", "hello");

        stream4reverseOrder
                .sorted(Comparator.reverseOrder())
                .forEach(x-> System.out.println("x = " + x));




         }


        public int getId(int i){
            return i++;
        }

        public static void peekMetho(){
            System.out.println("\n* peek  method :   with Peek  Method ");

            Stream<String> stream = Stream.of("black memba", "trigonocephale", "mangouste", "boa","cobra","vipere");

            Stream<String> copyStream = Stream.concat(Stream.empty(), stream);

            long count = stream
                        .peek(x->System.out.println(x))
                            .filter(x-> x.startsWith("b"))
                            //.peek(System.out::println)
                    .peek(x->System.out.println("After filter : "+x))
                            .count();
            System.out.println("count = " + count);


            long nbElemt = copyStream
                    .peek(x->System.out.println(x))
                    .filter(x-> x.startsWith("b"))
                    //.peek(System.out::println)
                    .peek(x->System.out.println("After filter copyStream : "+x))
                    .count();
            System.out.println("nbElemt = " + nbElemt);


        }

}
