import java.util.*;
import java.io.*;

public class AdjacencyMatrix {
    private int[][] adj;
    private final int NUMBER_OF_VERTICES;

    public AdjacencyMatrix(int vertices) {
        NUMBER_OF_VERTICES = vertices;
        adj = new int[NUMBER_OF_VERTICES][NUMBER_OF_VERTICES];
    }

    public void setEdge(int vertexSource, int vertexDestination,
            int weight) {
        try {
            adj[vertexSource][vertexDestination] = weight;
            adj[vertexDestination][vertexSource] = weight;
        } catch (ArrayIndexOutOfBoundsException indexBounce) {
            System.out.println("The vertex is invalid");
        }
    }

    public int getEdge(int vertexSource, int vertexDestination) {
        try {
            return adj[vertexSource][vertexDestination];
        } catch (ArrayIndexOutOfBoundsException indexBounce) {
            System.out.println("The vertex is invalid");
        }
        return -1;
    }

    public void printGraph() {
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Exercise 1
    public static AdjacencyMatrix loadFile(String filePath) {
        try {
            File myFile = new File(filePath);
            Scanner sc = new Scanner(myFile);
            int vertices = Integer.valueOf(sc.nextLine());
            AdjacencyMatrix graph = new AdjacencyMatrix(vertices);

            int i = 0;
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                String[] elementsInRow = row.split(" ");
                for (int j = 0; j < vertices; j++) {
                    graph.setEdge(i, j, Integer.valueOf(elementsInRow[j]));
                }
                i++;
            }

            sc.close();
            return graph;
        } catch (FileNotFoundException e) {
            System.out.println("Can't load file");
            return null;
        }
    }

    public int countVertices() {
        return NUMBER_OF_VERTICES;
    }

    public int countEdges() {
        int count = 0;
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
                if (adj[i][j] != 0) {
                    count++;
                }
            }
        }
        return count / 2; // undirected graph
    }

    public void enumerateNeighborsOfVertex(int u) {
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            if (adj[u][i] != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public boolean doesEdgeExist(int u, int v) {
        return adj[u][v] != 0;
    }

    // Exercise 4
    public AdjacencyList convertToAL() {
        AdjacencyList graph = new AdjacencyList(NUMBER_OF_VERTICES);
        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            for (int j = 0; j < NUMBER_OF_VERTICES; j++) {
                if (adj[i][j] != 0) {
                    graph.addEdge(i, j);
                }
            }
        }
        return graph;
    }

    // Exercise 5
    public void BFS(int s) {
        boolean visited[] = new boolean[NUMBER_OF_VERTICES];

        Queue<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            int x = queue.poll();
            System.out.print(x + " ");

            for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
                if (adj[x][i] != 0 && visited[i] == false) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public void DFS_recur(int v, boolean[] visited) {
        visited[v] = true;

        System.out.print(v + " ");

        for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
            if (adj[v][i] != 0 && visited[i] == false) {
                DFS_recur(i, visited);
            }
        }
    }

    public void DFS(int s) {
        boolean[] visited = new boolean[NUMBER_OF_VERTICES];
        DFS_recur(s, visited);
    }

    public void DFS_stack(int s) {
        boolean visited[] = new boolean[NUMBER_OF_VERTICES];

        Stack<Integer> stack = new Stack<Integer>();

        visited[s] = true;
        stack.add(s);

        while (!stack.isEmpty()) {
            int x = stack.pop();
            System.out.print(x + " ");

            for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
                if (adj[x][i] != 0 && visited[i] == false) {
                    stack.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public boolean isReachable(int v, int u) {
        boolean visited[] = new boolean[NUMBER_OF_VERTICES];

        Queue<Integer> queue = new LinkedList<Integer>();

        visited[v] = true;
        queue.add(v);

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for (int i = 0; i < NUMBER_OF_VERTICES; i++) {
                if (adj[x][i] != 0 && visited[i] == false) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

        return visited[u];
    }
}