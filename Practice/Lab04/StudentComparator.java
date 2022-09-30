import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        if (Double.compare(st1.averageScore(), st2.averageScore()) == 0)
            return 0;
        else if (Double.compare(st1.averageScore(), st2.averageScore()) < 0)
            return -1;
        else 
            return 1;
    }
}