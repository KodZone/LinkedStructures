package Scenario3_CoreMethods;

// Building.java
public class Building {

    private String address; private String owner;
    private static int numBuildings = 0; // Static counter (class-level)

    // Default constructor
    public Building() {this.address = ""; this.owner = "";
        numBuildings++;}

    // Overloaded constructor
    public Building(String address, String owner) {
        this.address = address;this.owner = owner;
        numBuildings++;}

    // Static accessor for the counter
    public static int getNumBuildings() {return numBuildings;}

    public String getAddress() {return this.address;}
    public void setAddress(String address) {this.address = address;}

    public String getOwner() {return this.owner;}
    public void setOwner(String owner) {this.owner = owner;}

    public String toString() {
        return this.address + " occupied by " + this.owner;
    }

    // This equals() method overrides the standard equals() method
    // defined in the built-in Object class (java.lang.Object)
    @Override
    public boolean equals(Object other) {

        // Check if the object being compared is a Building
        if (other instanceof Building) {

            // Convert the Object into a Building
            Building otherBuilding = (Building) other;

            // Two buildings are equal if they have the same address
            return this.address.equals(otherBuilding.address);
        }

        // If the object is not a Building, they are not equal
        return false;
    }

}


