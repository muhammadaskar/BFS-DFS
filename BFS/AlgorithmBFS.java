package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class AlgorithmBFS {
    public static GraphNode bfs(GraphNode startNode, int target) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(startNode);

        startNode.vistited = true;

        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.poll();
            System.out.print(currentNode.data + " ");

            if (currentNode.data == target) {
                return currentNode;
            }

            for (GraphNode neighbor : currentNode.neighbors) {
                if (!neighbor.vistited) {
                    queue.add(neighbor);
                    neighbor.vistited = true;
                }
            }
        }

        return null;
    }
}
