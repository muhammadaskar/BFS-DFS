package DFS;

public class Main {
    public static void main(String[] args) {
        Node root = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');
        Node g = new Node('G');

        root.addChild(b);
        root.addChild(c);

        b.addChild(d);
        b.addChild(e);

        c.addChild(f);
        c.addChild(g);

        char target = 'F';
        boolean result = AlgorithmDFS.dfs(root, target);

        if (result != false) {
            System.out.println("Data target " + target + " berhasil ditemukan");
        } else {
            System.out.println("Data target " + target + " tidak ditemukan");
        }
    }
}
