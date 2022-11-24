public class Test {
    public static void main(String[] args) {
        // Exercise 1
        AdjacencyMatrix graphAM = AdjacencyMatrix.loadFile("AM.txt");
        graphAM.printGraph();
        System.out.println(graphAM.countVertices());
        System.out.println(graphAM.countEdges());
        graphAM.enumerateNeighborsOfVertex(0);
        System.out.println(graphAM.doesEdgeExist(0, 1));
        System.out.println(graphAM.doesEdgeExist(0, 3));

        // Exercise 2
        AdjacencyList graphAL = AdjacencyList.loadFile("AL.txt");
        graphAL.printGraph();
        System.out.println(graphAL.countVertices());
        System.out.println(graphAL.countEdges());
        graphAL.enumerateNeighborsOfVertex(0);
        System.out.println(graphAL.doesEdgeExist(0, 1));
        System.out.println(graphAL.doesEdgeExist(0, 3));

        // Exercise 3
        EdgeList graphEL = EdgeList.loadFile("EL.txt");
        graphEL.printGraph();
        System.out.println(graphEL.countVertices());
        System.out.println(graphEL.countEdges());
        graphEL.enumerateNeighborsOfVertex(0);
        graphEL.enumerateNeighborsOfVertex(1);
        graphEL.enumerateNeighborsOfVertex(2);
        graphEL.enumerateNeighborsOfVertex(3);
        graphEL.enumerateNeighborsOfVertex(4);
        System.out.println(graphEL.doesEdgeExist(0, 1));
        System.out.println(graphEL.doesEdgeExist(1, 0));
        System.out.println(graphEL.doesEdgeExist(1, 3));

        // Exercise 4
        graphAM.convertToAL().printGraph();

        // Exercise 5
        graphAM.BFS(0);
        System.out.println();
        graphAM.DFS(0);
        System.out.println();
        graphAM.DFS_stack(0);
        System.out.println();
        System.out.println(graphAM.isReachable(0, 4));
        System.out.println(graphAM.isReachable(6, 2));

        AdjacencyMatrix graph = AdjacencyMatrix.loadFile("DisconnectedGraph.txt");
        System.out.println(graph.isReachable(0, 1));
        System.out.println(graph.isReachable(0, 2));
        System.out.println(graph.isReachable(3, 4));
        System.out.println(graph.isReachable(3, 5));
        System.out.println(graph.isReachable(0, 3));
        System.out.println(graph.isReachable(0, 4));
        System.out.println(graph.isReachable(0, 5));
    }
}