package BFS;

public class Main {
    public static void main(String[] args) {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);
        GraphNode node6 = new GraphNode(6);
        GraphNode node7 = new GraphNode(7);
        GraphNode node8 = new GraphNode(8);
        GraphNode node9 = new GraphNode(9);

        node1.addNeigbor(node2);
        node1.addNeigbor(node3);
        node1.addNeigbor(node4);

        node2.addNeigbor(node5);
        node2.addNeigbor(node6);

        node3.addNeigbor(node6);

        node4.addNeigbor(node8);
        node4.addNeigbor(node7);

        node8.addNeigbor(node9);

        int target = 9;
        GraphNode result = AlgorithmBFS.bfs(node1, target);

        if (result != null) {
            System.out.println("Node dengan data " + target + " berhasil ditemukan");
        } else {
            System.out.println("Node dengan data " + target + " tidak ditemukan");
        }
    }
}
