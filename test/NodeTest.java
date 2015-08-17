import programmingproblems.ADLinkedList;
import org.junit.Test;
import static org.junit.Assert.*;
import programmingproblems.Node;

/**
 *
 * @author Alberto Dal Dosso
 */
public class NodeTest {
    
    @Test
    public void testHeadCreation() {
        Node node = new Node(10);
        assertNotNull(node);
    }

    @Test
    public void testNodeCreation() {
        Node head = new Node(10);
        assertNotNull(head);
        
        Node node = new Node(head, 10);
        assertNotNull(node);
    }
    
    @Test
    public void testInsert() {
        Node head = new Node(10);
        Node node = ADLinkedList.insert(head, 11);
        assertNotNull(node);
    }
    
    @Test
    public void testInsertAndCount() {
        Node head = new Node(10);
        Node node = ADLinkedList.insert(head, 11);
        assertEquals(2, ADLinkedList.count(node));
    }
    
    @Test
    public void testInsertSorted() {
        Node head = new Node(10);
        Node node = ADLinkedList.insertSorted(head, 11);
        assertEquals(10, node.getData());
        assertEquals(10, head.getData());
        assertEquals(11, head.getNext().getData());
        assertEquals(2, ADLinkedList.count(node));
        assertEquals(1, ADLinkedList.count(node.getNext()));
        assertEquals(node, head);
    }
    
    @Test
    public void testParamByReference() {
        Node head = new Node(15);
        assertEquals(15, head.getData());
        ADLinkedList.changeNodeData(head, 20);
        assertEquals(20, head.getData());
        Node node = ADLinkedList.insert(head, 11);
        assertEquals(head, node.getNext());
        ADLinkedList.changeNodeNext(node, node);
        assertEquals(node, node.getNext());
    }
    
    @Test
    public void testCount() {
        Node head = new Node(0);
        Node node1 = ADLinkedList.insert(head, 1);
        Node node2 = ADLinkedList.insert(node1, 2);
        Node node3 = ADLinkedList.insert(node2, 3);
        
        assertEquals(0, head.getData());
        assertEquals(1, node1.getData());
        assertEquals(2, node2.getData());
        assertEquals(3, node3.getData());
        assertEquals(4, ADLinkedList.count(node3));
        assertEquals(0, head.getData());
        assertEquals(1, node1.getData());
        assertEquals(2, node2.getData());
        assertEquals(3, node3.getData());
        assertEquals(4, ADLinkedList.countIt(node3));
        assertEquals(0, head.getData());
        assertEquals(1, node1.getData());
        assertEquals(2, node2.getData());
        assertEquals(3, node3.getData());
    }
    
}
