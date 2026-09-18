import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Scenario1_Node.*;

public class TestScenario1_Node {
    /* GIVEN EXAMPLE – When a Node is created with a value,
     * getData() should return the same value */
    @Test
    public void testNodeStoresBuildingData() {
        Building b1 = new Building("1 High St", "Owner1");
        Node n1 = new Node(b1);
        // Building.equals compares by address, so assertEquals works here.
        assertEquals(b1, n1.getData());
    }

    /* Task 1 – Create a Node using a different Building (e.g., "2 High St"),
     * then verify getData() returns an equal Building using assertEquals. */


    /* Task 2 – When one Node is linked to another using setNext(),
     * getNext() should NOT be null */


    /* Task 3 – When a Node is created (default constructor),
     * its next reference should initially be null */
}

