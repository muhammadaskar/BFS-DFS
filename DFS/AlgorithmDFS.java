package DFS;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class AlgorithmDFS {
    public static boolean dfs(Node startNode, char target) {
        if (startNode == null)
            return false;

        Stack<Node> stack = new Stack<>();
        stack.push(startNode);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.data + " ");

            if (current.data == target) {
                return true;
            }

            List<Node> children = current.children;
            Collections.reverse(children); // For the left-to-right DFS order
            for (Node child : children) {
                stack.push(child);
            }
        }
        return false;
    }
}
