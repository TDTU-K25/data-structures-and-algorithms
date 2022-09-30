public class Student {
    private String name;
    private double mathematics;
    private double programming;
    private double DSA1;

    public Student(String name, double mathematics, double programming, double DSA1) {
        this.name = name;
        this.mathematics = mathematics;
        this.programming = programming;
        this.DSA1 = DSA1;
    }

    public double averageScore() {
        return (mathematics + programming + DSA1) / 3;
    }

    @Override
    public String toString() {
        return String.format("Name: %s {Mathematics: %.2f, Programming: %.2f, DSA1: %.2f, Average score: %.2f}", name,
                mathematics, programming, DSA1, averageScore());
    }
}