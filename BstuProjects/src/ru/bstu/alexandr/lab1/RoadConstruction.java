package ru.bstu.alexandr.lab1;

import java.util.Scanner;

/**
 * Created by Александр on 26.09.2016.
 */
public abstract class RoadConstruction extends Construction {
    private int length;

    public void init(Scanner in) {
        super.init(in);
        length = readInt(in, "Enter length: ");
    }

    public String toString() {
        return super.toString() + ", length: " + length;
    }
}
