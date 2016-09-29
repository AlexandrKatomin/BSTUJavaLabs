package ru.bstu.alexandr.lab1;
//import ru.bstu.alexandr.lab1.Construction;

import java.util.Scanner;

/**
 * Created by Александр on 22.09.2016.
 */
public abstract class Building extends Construction {
    private int countFloors;

    public void init(Scanner in) {
        super.init(in);
        countFloors = readInt(in, "Enter count of floors: ");
    }

    public String toString() {
        return super.toString() + ", count of floors: " + countFloors;
    }
}
