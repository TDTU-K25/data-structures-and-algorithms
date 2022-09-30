import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void print(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Lan", 5, 3, 4));
        students.add(new Student("An", 9.5, 9.25, 8));
        students.add(new Student("Duy", 7.5, 2, 6));
        students.add(new Student("Dung", 4.25, 5, 7.75));
        students.add(new Student("Huy", 5, 6.5, 10));
        
        // sort by the average grade in ascending order
        print(students);
        Collections.sort(students, new StudentComparator());
        print(students);
        
        // sort by the average grade in descending order
        print(students);
        Collections.sort(students, Collections.reverseOrder(new StudentComparator()));
        print(students);
    }
}
