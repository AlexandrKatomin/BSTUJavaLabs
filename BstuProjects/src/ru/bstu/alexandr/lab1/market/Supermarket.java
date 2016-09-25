package ru.bstu.alexandr.lab1.market;

import java.util.Scanner;

/**
 * Created by Александр on 22.09.2016.
 */
public class Supermarket extends Building {
    int area;
    // int exploitationPeriod;
    int countExit;

    public void init(Scanner in) {
        exploitationPeriod = readInt(in, "Enter exploitationPeriod: ");
        countFloors = readInt(in, "Enter count of floors: ");
        area = readInt(in, "Enter area: ");
        countExit = readInt(in, "Enter count of Exits: ");
    }


    public String toString() {
        return "It is supepmarket; exploitationPeriod: "
                + exploitationPeriod + ", " + "count of floors: "
                + countFloors + ", " + "area: " + ", count of Exits: "
                + countExit;
    }
}
