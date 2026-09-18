package Scenario3_CoreMethods;

// House.java
public class House extends Building {

    private int numBedrooms; private boolean hasGarage;
    private static int numHouses = 0; // Static counter for houses

    public House() {
        super();
        this.numBedrooms = 0;
        this.hasGarage = false;
        numHouses++;
    }

    public House(String address, String owner, int numBedrooms, boolean hasGarage) {
        super(address, owner);
        this.numBedrooms = numBedrooms;
        this.hasGarage = hasGarage;
        numHouses++;
    }

    public static int getNumHouses() {return numHouses;}

    public int getNumBedrooms() {return this.numBedrooms;}
    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;}

    public boolean getHasGarage() {return this.hasGarage;}
    public void setHasGarage(boolean hasGarage) {this.hasGarage = hasGarage;}

    public String toString() {
        return "House: " + super.toString()
                + " | bedrooms: " + this.numBedrooms
                + " | garage: " + this.hasGarage;
    }
}
