package BFS;

public class QueueNode {
    GraphNode data;
    QueueNode pointer;

    QueueNode() {
    }

    QueueNode(GraphNode data) {
        this.data = data;
    }
}
