package BFS;

import java.util.ArrayList;

public class GraphNode {
    int data;
    ArrayList<GraphNode> neighbors;
    boolean vistited;

    GraphNode(int data) {
        this.data = data;
        this.neighbors = new ArrayList<>();
        this.vistited = false;
    }

    public void addNeigbor(GraphNode neighbor) {
        neighbors.add(neighbor);
    }
}