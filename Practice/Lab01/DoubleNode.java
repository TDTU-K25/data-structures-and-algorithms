public class DoubleNode {
    private double element;
    private DoubleNode next;

    public DoubleNode() {
        element = 0.0;
        next = null;
    }

    public DoubleNode(double data) {
        element = data;
        next = null;
    }

    public DoubleNode(double data, DoubleNode next) {
        element = data;
        this.next = next;
    }

    public double getData() {
        return element;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setData(double data) {
        element = data;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
}