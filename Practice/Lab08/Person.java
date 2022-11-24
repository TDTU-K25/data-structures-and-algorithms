public class Person {
    private String name;
    private int priorityNumber;

    public Person(String name, int priorityNumber) {
        this.name = name;
        this.priorityNumber = priorityNumber;
    }

    public String getName() {
        return name;
    }

    public int getPriorityNumber() {
        return priorityNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriorityNumber(int priorityNumber) {
        this.priorityNumber = priorityNumber;
    }
}