package Scenario4_AllMethods;

public class LinkedBag implements BagInterface {
    // ----- State (structure of the linked bag) -----
    private Node firstNode;        // head (null when bag is empty)
    private int numberOfEntries;   // number of nodes/items in the bag

    // ----- Constructor -----
    public LinkedBag() { this.firstNode = null; this.numberOfEntries = 0; }

    // ----- Methods (Based on the Interface -----
    @Override public boolean addNewEntry(Building newEntry) {
        Node newNode = new Node(newEntry);   // create node holding the new Building
        newNode.setNext(this.firstNode);     // link it in front of the current head
        this.firstNode = newNode;            // new node becomes the first node
        this.numberOfEntries++;              // update size
        return true;                         // head insertion always succeeds (unless OOM)
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

    @Override public Building remove() {
        // If the bag is empty, nothing to remove
        if (this.firstNode == null) return null;

        // Save the head's data to return + Advance head to the next node
        Building result = this.firstNode.getData();
        this.firstNode = this.firstNode.getNext();
        this.numberOfEntries--;   // Update size
        return result; // Return the removed item
    }

    // Helper: return the first node whose data equals anEntry, or null if absent
    private Node findEntry(Building anEntry) {
        Node current = this.firstNode;
        while (current != null) {
            if (java.util.Objects.equals(current.getData(), anEntry)) return current;
            current = current.getNext();
        }
        return null;
    }

    @Override public boolean remove(Building anEntry) {
        // 1) Find the node that holds the entry
        Node nodeToRemove = findEntry(anEntry);
        if (nodeToRemove == null || this.firstNode == null) return false;

        // 2) Copy the data from the first node into the found node
        nodeToRemove.setData(this.firstNode.getData());

        // 3) Remove the first node (head removal is O(1))
        this.firstNode = this.firstNode.getNext();
        this.numberOfEntries--;

        return true;
    }

    @Override public int getCurrentSize() {
        // number of items currently in the chain
        return this.numberOfEntries;
    }

    @Override public boolean isEmpty() {
        // true when there are no nodes in the chain
        return this.numberOfEntries == 0;   // (equivalently: this.firstNode == null)
    }

    @Override public void clear() {
        // Clear by repeatedly removing the head
        while (!isEmpty()) remove();
    }

    @Override public int getFrequencyOf(Building anEntry) {
        // Count how many nodes store 'anEntry'
        int count = 0;
        for (Node current = firstNode; current != null; current = current.getNext()) {
            // Null-safe value check: matches if both are equal by value
            if (java.util.Objects.equals(current.getData(), anEntry)) {
                count++;  // increment for each match
            }
        }
        return count; // total matches found
    }

    @Override public boolean contains(Building anEntry) {
        // Traverse the chain and stop at the first match
        for (Node current = firstNode; current != null; current = current.getNext()) {
            if (java.util.Objects.equals(current.getData(), anEntry)) {
                return true; // found the target
            }
        }
        return false; // reached end without a match
    }
}