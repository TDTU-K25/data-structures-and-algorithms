import java.util.*;
import java.io.*;

public class AdjacencyList {
    private int V; // No. of vertices
    private ArrayList<LinkedList<Integer>> adj;

    public AdjacencyList(int v) {
        V = v;
        adj = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < v; ++i)
            adj.add(new LinkedList<Integer>());
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ": ");
            System.out.print("head");
            for (Integer v : adj.get(i)) {
                System.out.print("->" + v);
            }
            System.out.println();
        }
    }

    // Exercise 2
    public static AdjacencyList loadFile(String filePath) {
        try {
            File myFile = new File(filePath);
            Scanner sc = new Scanner(myFile);
            int vertices = Integer.valueOf(sc.nextLine());
            AdjacencyList graph = new AdjacencyList(vertices);

            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                String[] elementsInRow = row.split(" ");
                for (int i = 1; i < elementsInRow.length; i++) {
                    graph.addEdge(Integer.valueOf(elementsInRow[0]), Integer.valueOf(elementsInRow[i]));
                }
            }
            sc.close();
            return graph;
        } catch (FileNotFoundException e) {
            System.out.println("Can't load file");
            return null;
        }
    }

    public int countVertices() {
        return V;
    }

    public int countEdges() {
        int count = 0;
        for (int i = 0; i < V; i++) {
            count += adj.get(i).size();
        }
        return count / 2; // undirected graph
    }

    public void enumerateNeighborsOfVertex(int u) {
        for (int i = 0; i < adj.get(u).size(); i++) {
            System.out.print(adj.get(u).get(i) + " ");
        }
        System.out.println();
    }

    public boolean doesEdgeExist(int u, int v) {
        for (int i = 0; i < adj.get(u).size(); i++) {
            if (adj.get(u).get(i) == v) {
                return true;
            }
        }
        return false;
    }
}