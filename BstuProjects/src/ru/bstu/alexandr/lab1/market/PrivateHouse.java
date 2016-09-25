package ru.bstu.alexandr.lab1.market;

import java.util.Scanner;

/**
 * @author Александр on 22.09.2016.
 * todo сделать все классы наследники аналогичны этому
 */
public class PrivateHouse extends Building {
    private int countBedrooms;

    public void init(Scanner in) {
        exploitationPeriod = readInt(in, "Enter exploitationPeriod: ");
        countFloors = readInt(in, "Enter count of floors: ");
        countBedrooms = readInt(in, "Enter count of bedrooms: ");
    }
    public String toString() {
        return "It is PrivateHouse; exploitationPeriod: "
                + exploitationPeriod + ", " + "count of floors: "
                + countFloors + ", " + "area: " + ", "
                + "count of bedrooms: " + countBedrooms;
    }
}
