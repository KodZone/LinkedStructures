package Scenario1_Node;

// Creates three Building objects with unique addresses/owners.
public class NodeTest {
    public static void main(String[] args) {
        // Create Building payloads (uses your Building constructors/toString)
        Building b1 = new Building("10 Queen's Way", "Maya Khan");
        Building b2 = new Building("22 Riverside Close", "Liam O'Connor");
        Building b3 = new Building("5 Baker Street", "Nora Patel");
        // Wrap each Building in a Node
        Node node1 = new Node(b1);
        Node node2 = new Node(b2);
        Node node3 = new Node(b3);
        // ---- Link them into a chain: node1 -> node2 -> node3 ----
        node1.setNext(node2);
        node2.setNext(node3);

        // ---- Traverse from head (node1) without direct use of node2/node3 ----
        Node current = node1; int index = 1;
        while (current != null) {
            System.out.println("node" + index + " -> " + current);
            current = current.getNext(); index++;
        }

        // show how many Buildings were created (STATIC counter in Building)
        System.out.println("Total buildings created: " + Building.getNumBuildings());
    }
}
