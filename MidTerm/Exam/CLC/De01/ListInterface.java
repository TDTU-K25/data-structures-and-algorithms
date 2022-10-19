import java.util.NoSuchElementException;

public interface ListInterface {
    public void addFirst(int data);

    public int getLast() throws NoSuchElementException;

    public int getSumEven();
}