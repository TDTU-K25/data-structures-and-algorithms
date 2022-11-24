public class VisitedObject {
    private Visitor visitor;
    private Destination destination;
    private double rating;

    public VisitedObject(Visitor visitor, Destination destination, double rating) {
        this.visitor = visitor;
        this.destination = destination;
        this.rating = rating;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
