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

    public void testNodeCreation() {
        Node head = new Node(10);
        assertNotNull(head);
        
        Node node = new Node(head, 10);
        assertNotNull(node);
    }
}
