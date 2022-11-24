import java.util.*;
import java.io.*;

class IntegerTriple {
    private Integer weight;
    private Integer source;
    private Integer dest;

    public IntegerTriple(Integer w, Integer s, Integer d) {
        weight = w;
        source = s;
        dest = d;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getSource() {
        return source;
    }

    public Integer getDest() {
        return dest;
    }

    @Override
    public String toString() {
        return weight + " " + source + " " + dest;
    }
}

public class EdgeList {
    private Vector<IntegerTriple> edges;

    public EdgeList() {
        edges = new Vector<IntegerTriple>();
    }

    public void addEdge(int w, int u, int v) {
        edges.add(new IntegerTriple(w, u, v));
    }

    public void printGraph() {
        for (int i = 0; i < edges.size(); i++) {
            System.out.println(edges.get(i));
        }
    }

    // Exercise 3
    public static EdgeList loadFile(String filePath) {
        try {
            File myFile = new File(filePath);
            Scanner sc = new Scanner(myFile);
            EdgeList graph = new EdgeList();

            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                String[] elementsInRow = row.split(" ");
                graph.addEdge(Integer.valueOf(elementsInRow[0]), Integer.valueOf(elementsInRow[1]),
                        Integer.valueOf(elementsInRow[2]));
            }
            sc.close();
            return graph;
        } catch (FileNotFoundException e) {
            System.out.println("Can't load file");
            return null;
        }
    }

    public int countVertices() {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < edges.size(); i++) {
            set.add(edges.get(i).getSource());
            set.add(edges.get(i).getDest());
        }
        return set.size();
    }

    public int countEdges() {
        return edges.size();
    }

    public void enumerateNeighborsOfVertex(int u) {
        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i).getSource() == u) {
                System.out.print(edges.get(i).getDest() + " ");
            } else if (edges.get(i).getDest() == u) {
                System.out.print(edges.get(i).getSource() + " ");
            } // undirected graph
        }
        System.out.println();
    }

    public boolean doesEdgeExist(int u, int v) {
        for (int i = 0; i < edges.size(); i++) {
            if ((edges.get(i).getSource() == u && edges.get(i).getDest() == v)
                    || (edges.get(i).getSource() == v && edges.get(i).getDest() == u)) { // undirected graph
                return true;
            }
        }
        return false;
    }
}