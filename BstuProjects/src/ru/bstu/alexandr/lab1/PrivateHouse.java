package ru.bstu.alexandr.lab1;

import java.util.Scanner;

/**
 * @author Александр on 22.09.2016.
 */
public class PrivateHouse extends Building {
    private int countBedrooms;

    public void init(Scanner in) {
        super.init(in);
        countBedrooms = readInt(in, "Enter count of bedrooms: ");
    }
    public String toString() {
        return "It is PrivateHouse; " + super.toString()
                + "area: " + ", count of bedrooms: " + countBedrooms;
    }
}
