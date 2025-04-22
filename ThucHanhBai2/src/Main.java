import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Student student1 = new Student("Nam",20,"HN");
    Student student2 = new Student("Hoàng",22,"HN");
    Student student3 = new Student("Lan",21,"HN");
        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);
        for (Map.Entry<Integer,Student> entry : studentMap.entrySet()) {
            System.out.println(entry.toString());
        }
        Set<Student> Student = new HashSet<>();
        Student.add(student1);
        Student.add(student2);
        Student.add(student3);
        Student.add(student1);

        for(Student student: Student) {
            System.out.println(student.toString());
        }

}}