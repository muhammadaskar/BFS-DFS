package BFS;

public class AlgorithmBFS {
    public static GraphNode bfs(GraphNode startNode, int target) {
        AlgorithmQueue queue = new AlgorithmQueue();
        queue.enqueue(new QueueNode(startNode));

        startNode.vistited = true;

        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.dequeue();
            System.out.print(currentNode.data + " ");

            if (currentNode.data == target) {
                return currentNode;
            }

            for (GraphNode neighbor : currentNode.neighbors) {
                if (!neighbor.vistited) {
                    queue.enqueue(new QueueNode(neighbor));
                    neighbor.vistited = true;
                }
            }
        }

        return null;
    }
}
