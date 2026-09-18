package Scenario3_CoreMethods;

// Node: building block of a singly linked chain (linked list).
public class Node {
    private Building data;  // payload: one Building object
    private Node next;      // link to the next Node in the chain

    // Default (no-arg) constructor.
    public Node() { this.data = null; this.next = null; }
    // Parameterised constructor: sets the payload; next is null by default.
    public Node(Building data) { this.data = data; this.next = null; }

    // ---- Accessors (Getters) ----
    public Building getData() { return data; }
    public Node getNext()     { return next; }

    // ---- Mutators (Setters) ----
    public void setData(Building data) { this.data = data; }
    public void setNext(Node next)     { this.next = next; }

    // ---- Optional: helpful when printing a Node ----
    @Override
    public String toString() {
        return (data == null) ? "null" : data.toString();
    }
}
