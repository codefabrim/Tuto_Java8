package tutoj8.streams.mocks.streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 26.04.18
 * Time: 17:42
 * package : tutoj8.streams.mocks.streamapi
 * Responsability of classe :
 */
public class MainCollectors {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(new Student("student1", Student.Grade.B),
                new Student("student3", Student.Grade.D),
                new Student("student2", Student.Grade.A),
                new Student("student4", Student.Grade.B),
                new Student("student5", Student.Grade.C),
                new Student("student6", Student.Grade.D),
                new Student("student7", Student.Grade.A),
                new Student("student8", Student.Grade.B),
                new Student("student9", Student.Grade.C)

        );

        //Comparator

   //    Map<Student.Grade, List<String> grouping =
     //          list.stream().collect(Collectors
//                       .groupingBy(Student::getGrade,
//                               Collector .groupingBy(Student::getGrade,
//                               Collectors.mapping(Student::getName, Collectors.toList())));
//

//        7777777//////7
//        7777777//////7
//        7777777//////7
//.groupingBy(Student::getGrade,
 //                              Collectors.mapping(Student::getName, Collectors.toList())));



    }
}
