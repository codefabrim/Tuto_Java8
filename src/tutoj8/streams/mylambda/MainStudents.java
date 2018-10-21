package tutoj8.streams.mylambda;

/**
 * Created by Oana on 25.04.2018.
 */
public class MainStudents {


    public static void main(String[] args) {
        print (new Student(12,"toto12"), s -> s.getNote() );

    }

    public static void print(Student s, ICheckStd ics){
        if (ics.evaluate(s) > 10) {
            System.out.println(s.getName() + " PASS with score  = " + s.getNote() );


        }
    }



}
