import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Student s1 = new Student("Ha",22,"HN");
    Student s2 = new Student("Nam",21,"HP");
    Student s3 = new Student("Giang",20,"HN");
    Student s4 = new Student("Tu",23,"HN");
    List<Student> students = new ArrayList<Student>();
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    Collections.sort(students);
    for (Student s : students) {
        System.out.println(s.toString());
    }
    AgeComparator ageComparator = new AgeComparator();
    Collections.sort(students, ageComparator);
        System.out.println("sort by age");
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}