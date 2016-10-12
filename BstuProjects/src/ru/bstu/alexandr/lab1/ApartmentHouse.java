package ru.bstu.alexandr.lab1;

import java.util.Scanner;

/**
 * Created by Александр on 22.09.2016.
 */
public class ApartmentHouse extends Building {
    private int countApartments;

    @Override
    public void init(Scanner in) {
        super.init(in);
        countApartments = readInt(in, "Enter count of apartments: ");
    }

    public String toString() {
        return "It is APARTMENT_HOUSE;" + super.toString()
                + ", count of apartments: " + countApartments;
    }
}
