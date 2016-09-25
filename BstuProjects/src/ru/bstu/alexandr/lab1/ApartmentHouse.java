package ru.bstu.alexandr.lab1;

import java.util.Scanner;

/**
 * Created by Александр on 22.09.2016.
 */
public class ApartmentHouse extends Building {
    int countApartments;

    @Override
    public void init(Scanner in) {
        exploitationPeriod = readInt(in, "Enter exploitationPeriod: ");
        countFloors = readInt(in, "Enter count of floors: ");
        countApartments = readInt(in, "Enter count of apartments: ");
    }

    public String toString() {
        return "It is ApartmentHouse; exploitationPeriod: "
                + exploitationPeriod + ", " + "count of floors: "
                + countFloors + ", area: " + ", "
                + "count of apartments: " + countApartments;
    }
}
