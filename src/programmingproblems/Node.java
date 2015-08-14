package programmingproblems;

/**
 *
 * @author Alberto Dal Dosso
 */
public class Node {
    private Node next;
    private final int data;

    public Node(int data) {
        this(null, data);
    }

    public Node(Node head, int data) {
        this.next = head;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    void setNext(Node node) {
        this.next = node;
    }
    
}
