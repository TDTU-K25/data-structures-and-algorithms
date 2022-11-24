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
        ArrayList<Destination> destinations = new ArrayList<Destination>();
        for (int i = 0; i < visitedObjects.size(); i++) {
            if (!destinations.contains(visitedObjects.get(i).getDestination())) {
                destinations.add(visitedObjects.get(i).getDestination());
            }
        }
        return destinations.size();
    }

    // Cau 2
    public ArrayList<String> getVisitorsByDestinationRating(int d, int r) {
        // code here
        ArrayList<String> visitorNames = new ArrayList<String>();
        for (int i = 0; i < visitedObjects.size(); i++) {
            if (visitedObjects.get(i).getDestination().getId() == d && visitedObjects.get(i).getRating() == r) {
                visitorNames.add(visitedObjects.get(i).getVisitor().getName());
            }
        }
        return visitorNames;
    }

    // Cau 3
    public double getAverageRating(int id) {
        // code here
        double sumRatingOfDestinationsVisited = 0;
        int numberOfDestinationsVisited = 0;
        for (int i = 0; i < visitedObjects.size(); i++) {
            if (visitedObjects.get(i).getVisitor().getId() == id) {
                sumRatingOfDestinationsVisited += visitedObjects.get(i).getRating();
                numberOfDestinationsVisited++;
            }
        }
        return sumRatingOfDestinationsVisited / numberOfDestinationsVisited;
    }

    // Cau 4
    public ArrayList<String> findOddDegree() {
        // code here
        ArrayList<Destination> destinations = new ArrayList<Destination>();
        for (int i = 0; i < visitedObjects.size(); i++) {
            if (!destinations.contains(visitedObjects.get(i).getDestination())) {
                destinations.add(visitedObjects.get(i).getDestination());
            }
        }

        ArrayList<Integer> numberOfNeighborVertices = new ArrayList<Integer>();  
        for (Destination dest : destinations) {
            int count = 0;
            for (int i = 0; i < visitedObjects.size(); i++) {
                if (dest.equals(visitedObjects.get(i).getDestination())) {
                    count++;
                }
            }  
            numberOfNeighborVertices.add(count);  
        }

        ArrayList<String> destinationNames = new ArrayList<String>();
        for (int i = 0; i < destinations.size(); i++) {
            if (numberOfNeighborVertices.get(i) % 2 != 0) {
                destinationNames.add(destinations.get(i).getName());
            }
        }
        return destinationNames;
    }
}