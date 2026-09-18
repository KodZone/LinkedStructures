package Scenario3_CoreMethods;

public class LinkedBagTest {

    public static void main(String[] args) {

        LinkedBag bag = new LinkedBag();

        Building b1 = new Building("1 High St", "Owner1");
        Building b2 = new Building("2 High St", "Owner2");
        Building b3 = new Building("3 High St", "Owner3");
        Building b4 = new Building("4 High St", "Owner4");

        bag.addNewEntry(b1);
        bag.addNewEntry(b2);
        bag.addNewEntry(b3);
        bag.addNewEntry(b4);

        System.out.println("All elements added to LinkedBag.");
        System.out.println("Note: items appear in reverse order.\n");
        System.out.println(bag.toString());
    }
}

