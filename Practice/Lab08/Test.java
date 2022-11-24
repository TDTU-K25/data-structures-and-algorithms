import java.util.Comparator;
import java.util.PriorityQueue;

public class Test {
    public static void heapSortDesc(int[] arr) {
        MaxHeap maxHeap = new MaxHeap(arr.length + 1);
        for (int i = 0; i < arr.length; i++) {
            maxHeap.insert(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = maxHeap.extractMax();
        }
    }

    public static void heapSortAsc(int[] arr) {
        MinHeap minHeap = new MinHeap(arr.length + 1);
        for (int i = 0; i < arr.length; i++) {
            minHeap.insert(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = minHeap.extractMin();
        }
    }

    // higher priority = higher number
    static class QueueOrderComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            if (p2.getPriorityNumber() > p1.getPriorityNumber()) {
                return 1;
            } else if (p2.getPriorityNumber() == p1.getPriorityNumber()) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {

        // Exercise 3
        int[] first_arr = { 15, 23, 18, 63, 21, 35, 36, 21, 66, 12, 42, 35, 75, 23, 64, 78, 39 };
        heapSortDesc(first_arr);
        for (int i = 0; i < first_arr.length; i++) {
            System.out.print(first_arr[i] + " ");
        }

        System.out.println();

        int[] second_arr = { 15, 23, 18, 63, 21, 35, 36, 21, 66, 12, 42, 35, 75, 23, 64, 78, 39 };
        heapSortAsc(second_arr);
        for (int i = 0; i < second_arr.length; i++) {
            System.out.print(second_arr[i] + " ");
        }

        System.out.println();

        // Exercise 4
        PriorityQueue<Person> q = new PriorityQueue<Person>(new QueueOrderComparator());
        q.add(new Person("Alex", 3));
        q.add(new Person("Bob", 2));
        q.add(new Person("David", 6));
        q.add(new Person("Susan", 1));
        System.out.println(q.poll().getName());
        q.add(new Person("Mike", 5));
        q.add(new Person("Kevin", 4));
        System.out.println(q.poll().getName());
        System.out.println(q.poll().getName());
        q.add(new Person("Helen", 0));
        q.add(new Person("Paul", 8));
        q.add(new Person("Iris", 7));
        System.out.println(q.poll().getName());
    }
}