package Scenario5_ArrayListBag;

public class ArrayListBagTest {

    public static void main(String[] args) {

        ArrayListBag bag = new ArrayListBag();

        Building b1 = new Building("1 High St", "Owner1");
        Building b2 = new Building("2 High St", "Owner2");
        Building b3 = new Building("3 High St", "Owner3");
        Building b4 = new Building("4 High St", "Owner4");

        System.out.println("1) Start: bag is empty? " + bag.isEmpty());
        System.out.println("   Size: " + bag.getCurrentSize());
        System.out.println();

        System.out.println("2) Add four Buildings");
        bag.addNewEntry(b1);
        bag.addNewEntry(b2);
        bag.addNewEntry(b3);
        bag.addNewEntry(b4);
        System.out.println(bag);
        System.out.println("   Size: " + bag.getCurrentSize());
        System.out.println("   Empty? " + bag.isEmpty());
        System.out.println();

        System.out.println("3) contains()");
        System.out.println("   Contains b2? " + bag.contains(b2));
        System.out.println("   Contains new Building(\"99 High St\",\"X\")? " +
                bag.contains(new Building("99 High St", "X")));
        System.out.println();

        System.out.println("4) getFrequencyOf() (add duplicate then count)");
        bag.addNewEntry(b2);
        System.out.println("   Added b2 again.");
        System.out.println("   Frequency of b2: " + bag.getFrequencyOf(b2));
        System.out.println("   Size: " + bag.getCurrentSize());
        System.out.println();

        System.out.println("5) remove(anEntry) (remove one occurrence of b2)");
        System.out.println("   Removed b2? " + bag.remove(b2));
        System.out.println("   Frequency of b2 now: " + bag.getFrequencyOf(b2));
        System.out.println("   Size: " + bag.getCurrentSize());
        System.out.println(bag);
        System.out.println();

        System.out.println("6) remove() (remove unspecified item - last in ArrayList)");
        Building removed = bag.remove();
        System.out.println("   remove() returned: " + removed);
        System.out.println("   Size: " + bag.getCurrentSize());
        System.out.println(bag);
        System.out.println();

        System.out.println("7) clear()");
        bag.clear();
        System.out.println("   After clear: Empty? " + bag.isEmpty());
        System.out.println("   Size: " + bag.getCurrentSize());
        System.out.println(bag);
    }
}
