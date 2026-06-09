import java.util.LinkedList;

public class GraphList {

    private LinkedList<Integer>[] adjList;
    private int numVertices;

    @SuppressWarnings("unchecked")
    public GraphList(int numVertices) {
        this.numVertices = numVertices;

        adjList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
        adjList[destination].add(source);
    }

    public void printGraph() {
        System.out.println("Adjacency List:");

        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");

            for (Integer v : adjList[i]) {
                System.out.print(v + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        GraphList graph = new GraphList(9);

        graph.addEdge(0, 1);
        graph.addEdge(0, 7);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 6);
        graph.addEdge(4, 7);
        graph.addEdge(5, 6);
        graph.addEdge(7, 8);

        graph.printGraph();
    }
}
