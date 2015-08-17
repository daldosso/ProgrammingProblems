package programmingproblems;

/**
 *
 * @author Alberto Dal Dosso
 */
public class ADLinkedList {

    public static Node insert(Node head, int data) {
        return new Node(head, data);
    }

    public static int count(Node node) {
        int result = 1;
        if (node.getNext() == null) {
            return result;
        } else {
            return result + count(node.getNext());
        }
    }
    
    public static int countIt(Node node) {
        int result = 1;
        while (node.getNext() != null) {
            node = node.getNext();
            result++;
        }
        return result;
    }

    public static Node insertSorted(Node head, int data) {
        if (head == null || data <= head.getData()) {
            return new Node(head, data);
        }
        Node current = head;
        while (current.getNext() != null && current.getNext().getData() < data) {
            current = current.getNext();
        }
        if (current.getNext() == null) {
            current.setNext(new Node(data));
        } else {
            current.setNext(new Node(current.getNext(), data));
        }
        return head;
    }

    public static void changeNodeData(Node head, int data) {
        head.setData(data);
    }

    public static void changeNodeNext(Node node, Node next) {
        node.setNext(next);
    }

}
