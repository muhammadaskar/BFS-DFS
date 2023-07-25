package BFS;

public class AlgorithmQueue {
    QueueNode head, tail, front;

    boolean isEmpty() {
        return front == null;
    }

    void add(QueueNode node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.pointer = node;
            tail = node;
        }
    }

    void enqueue(QueueNode node) {
        add(node);
        front = head;
    }

    void remove() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
                return;
            }
            head = head.pointer;
        }
    }

    GraphNode dequeue() {
        GraphNode data = front.data;
        remove();
        front = head;
        return data;
    }
}
