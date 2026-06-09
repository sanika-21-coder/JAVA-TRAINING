public class GraphMatrix {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public GraphMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix:");

        for (int i = 1; i < numVertices; i++) {
            for (int j = 1; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        GraphMatrix graph = new GraphMatrix(10);

        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.addEdge(4, 7);
        graph.addEdge(3, 6);

        graph.addEdge(2, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 7);

        graph.addEdge(1, 8);
        graph.addEdge(8, 6);
        graph.addEdge(8, 9);

        graph.printGraph();
    }
}
