package ru.bstu.alexandr.lab1;

import java.util.Scanner;

/**
 * Created by Александр on 22.09.2016.
 */
public class Supermarket extends Building {
    private int area;
    private int countExit;

    public void init(Scanner in) {
        super.init(in);
        area = readInt(in, "Enter area: ");
        countExit = readInt(in, "Enter count of Exits: ");
    }


    public String toString() {
        return "It is supepmarket; " + super.toString()
                + ", count of Exits: " + countExit;
    }
}
