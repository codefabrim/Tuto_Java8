package tutoj8.streams.mocks.streamapi;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 26.04.18
 * Time: 17:43
 * package : tutoj8.streams.mocks.streamapi
 * Responsability of classe :
 */
public class Student {
    public static enum Grade {A, B, C, D, E}

    private String name;
    private Grade grade;

    public Student(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return
               name  +
                " : " + grade;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}

