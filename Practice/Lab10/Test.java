public class Test {
    public static void main(String[] args) {
        AdjacencyList graph_AL = AdjacencyList.loadFile("AL.txt");
        graph_AL.prim(0);
        
        EdgeList graph_EL = EdgeList.loadFile("EL.txt");
        graph_EL.kruskal(0);
    }
}