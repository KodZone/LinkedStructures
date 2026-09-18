package Scenario3_CoreMethods;

// A skeleton of a Bag implementation backed by a singly linked chain.
public class LinkedBag implements BagInterface {
    private Node firstNode;
    private int numberOfEntries;

    public LinkedBag() {this.firstNode = null; this.numberOfEntries = 0;}

    @Override
    public boolean addNewEntry(Building newEntry) {
        Node newNode = new Node(newEntry);
        newNode.setNext(this.firstNode);
        this.firstNode = newNode;
        this.numberOfEntries++;
        return true;
    }

    @Override
    public String toString() {
        String resultStr = "Bag: ";
        Node currentNode = this.firstNode;
        while (currentNode != null) {
            resultStr += currentNode.getData() + "\n" +"     ";
            currentNode = currentNode.getNext();
        }
        return resultStr;
    }

    // Remaining methods (not required for this task)
    @Override public Building remove() { return null; }
    @Override public boolean remove(Building anEntry) { return false; }
    @Override public int getCurrentSize() { return 0; }
    @Override public boolean isEmpty() { return false; }
    @Override public void clear() { }
    @Override public int getFrequencyOf(Building anEntry) { return 0; }
    @Override public boolean contains(Building anEntry) { return false; }
}
