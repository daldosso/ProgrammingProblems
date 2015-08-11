package programmingproblems;

/**
 *
 * @author Alberto Dal Dosso
 */
public class Node {
    private final Node next;
    private final int data;

    public Node(int data) {
        this(null, data);
    }

    public Node(Node head, int data) {
        this.next = head;
        this.data = data;
    }

}
