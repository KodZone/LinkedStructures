package Scenario5_ArrayListBag;

// This interface defines the behaviors of a Bag ADT
// The Bag will store Building objects from the Anytown project
public interface BagInterface {

    // Returns the number of items currently in the bag
    int getCurrentSize();

    // Returns true if the bag is empty, otherwise false
    boolean isEmpty();

    // Returns true if the item was added successfully
    boolean addNewEntry(Building newEntry);

    // Removes and returns an unspecified Building from the bag
    // Returns null if the bag is empty
    Building remove();

    // Removes one occurrence of a specific Building
    // Returns true if the removal was successful
    boolean remove(Building anEntry);

    // Removes all items from the bag
    void clear();

    // Returns the number of times a specific Building appears in the bag
    int getFrequencyOf(Building anEntry);

    // Returns true if the bag contains a specific Building
    boolean contains(Building anEntry);

    // Returns a String representation of all Buildings in the bag
    String toString();
}

