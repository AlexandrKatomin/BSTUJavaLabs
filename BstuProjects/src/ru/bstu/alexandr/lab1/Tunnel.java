package ru.bstu.alexandr.lab1;

import java.util.Scanner;

/**
 * Created by Александр on 26.09.2016.
 */
public class Tunnel extends RoadConstruction {
    private int allowableHeightOfTransport;

    @Override
    public void init(Scanner in) {
        super.init(in);
        allowableHeightOfTransport = readInt(in, "Enter allowable height: ");
    }

    public String toString() {
        return "It is  Bridge; " + super.toString()
                + ", allowable height: " + allowableHeightOfTransport;
    }
}
