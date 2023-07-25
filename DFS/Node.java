package DFS;

import java.util.ArrayList;
import java.util.List;

public class Node {
    char data;
    List<Node> children;

    public Node(char data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        children.add(child);
    }
}
