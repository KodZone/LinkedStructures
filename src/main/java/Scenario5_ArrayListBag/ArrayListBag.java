package Scenario5_ArrayListBag;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBag implements BagInterface {
    private ArrayList<Building> bag = new ArrayList<>();

    @Override public boolean addNewEntry(Building newEntry) {
        bag.add(newEntry);
        return true;
    }
    @Override public String toString() {
        StringBuilder sb = new StringBuilder("Bag:");
        for (Building b : bag) sb.append(b).append("\n").append("    ");
        return sb.toString();
    }
    @Override public Building remove() {
        if (bag.isEmpty()) return null;
        return bag.remove(bag.size() - 1);
    }
    @Override public boolean remove(Building anEntry) {
        return bag.remove(anEntry); // removes first occurrence
    }
    @Override public void clear() { bag.clear(); }
    @Override public int getCurrentSize() { return bag.size(); }
    @Override public boolean isEmpty() { return bag.isEmpty(); }
    @Override public int getFrequencyOf(Building anEntry) {
        return Collections.frequency(bag, anEntry);
    }
    @Override public boolean contains(Building anEntry) {
        return bag.contains(anEntry);
    }
}


