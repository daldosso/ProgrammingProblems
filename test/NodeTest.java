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
        assertEquals(2, ADLinkedList.count(node));
    }
    
}
