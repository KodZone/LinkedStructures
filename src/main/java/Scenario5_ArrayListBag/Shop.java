package Scenario5_ArrayListBag;

import Scenario4_AllMethods.Building;

// Shop.java
public class Shop extends Building {

    private int numEmployees; private int averageTurnover;
    private static int numShops = 0; // Static counter for shops

    public Shop() {
        super();
        this.numEmployees = 0;
        this.averageTurnover = 0;
        numShops++;
    }

    public Shop(String address, String owner, int numEmployees, int averageTurnover) {
        super(address, owner);
        this.numEmployees = numEmployees;
        this.averageTurnover = averageTurnover;
        numShops++;
    }

    public static int getNumShops() {return numShops;}

    public int getNumEmployees() {return this.numEmployees;}

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;}

    public int getAverageTurnover() {return this.averageTurnover;}

    public void setAverageTurnover(int averageTurnover) {
        this.averageTurnover = averageTurnover;}

    public String toString() {
        return "Shop: " + super.toString()
                + " | employees: " + this.numEmployees
                + " | avg turnover: " + this.averageTurnover;
    }
}
