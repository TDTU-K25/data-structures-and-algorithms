import java.util.ArrayList;

public class EdgeList {

    private ArrayList<VisitedObject> visitedObjects;

    public EdgeList() {
        this.visitedObjects = new ArrayList<VisitedObject>();
    }

    public void addEdge(VisitedObject obj) {
        visitedObjects.add(obj);
    }

    // Cau 1
    public int findNumberDestinations() {
        // code here
        return -1;
    }

    // Cau 2
    public ArrayList<String> getVisitorsByDestinationRating(int d, int r) {
        // code here
        return null;
    }

    // Cau 3
    public double getAverageRating(int id) {
        // code here
        return -1;
    }

    // Cau 4
    public ArrayList<String> findOddDegree() {
        // code here
        return null;
    }

}
