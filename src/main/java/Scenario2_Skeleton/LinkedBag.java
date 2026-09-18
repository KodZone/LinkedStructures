package Scenario2_Skeleton;

// A skeleton of a Bag implementation backed by a singly linked chain.
public class LinkedBag implements BagInterface {
    // ----- State (structure of the linked bag) -----
    private Node firstNode;          // head (null when bag is empty)
    private int numberOfEntries;     // number of nodes/items in the bag
    // ----- Constructor -----
    public LinkedBag() { this.firstNode = null; this.numberOfEntries = 0; }

    // ----- BagInterface<Building> methods -----
    private Node findEntry(Building anEntry) { /* TODO */ return null; }
    @Override
    public boolean addNewEntry(Building newEntry) { /* TODO */ return false; }
    @Override
    public String toString() { /* TODO */ return ""; }
    @Override
    public Building remove() { /* TODO */ return null; }
    @Override
    public boolean remove(Building anEntry) { /* TODO */ return false; }
    @Override
    public int getCurrentSize() { /* TODO */ return 0; }
    @Override
    public boolean isEmpty() { /* TODO */ return false; }
    @Override
    public void clear() { /* TODO */ }
    @Override
    public int getFrequencyOf(Building anEntry) { /* TODO */ return 0; }
    @Override
    public boolean contains(Building anEntry) { /* TODO */ return false; }
}
