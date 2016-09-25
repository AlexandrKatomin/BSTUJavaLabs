package ru.bstu.alexandr.lab1;

import java.util.Scanner;

/**
 * Created by Александр on 26.09.2016.
 */
public class Tunnel extends RoadConstruction {
    int allowableHeightOfTransport;

    @Override
    public void init(Scanner in) {
        exploitationPeriod = readInt(in, "Enter exploitationPeriod: ");
        length = readInt(in, "Enter length: ");
        allowableHeightOfTransport = readInt(in, "Enter allowable height: ");
    }

    public String toString() {
        return "It is  Bridge; exploitationPeriod: "
                + exploitationPeriod + ", " + "length: "
                + length + ", " + "allowable height: " + allowableHeightOfTransport;
    }
}
