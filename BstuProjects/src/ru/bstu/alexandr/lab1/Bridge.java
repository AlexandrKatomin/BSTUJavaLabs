package ru.bstu.alexandr.lab1;

import java.util.Scanner;

/**
 * Created by Александр on 26.09.2016.
 */
public class Bridge extends RoadConstruction {
    int allowableWeightOFTransport; //допустимый вес

    @Override
    public void init(Scanner in) {
        exploitationPeriod = readInt(in, "Enter exploitationPeriod: ");
        length = readInt(in, "Enter length: ");
        allowableWeightOFTransport = readInt(in, "Enter allowable weight: ");
    }

    public String toString() {
        return "It is  Bridge; exploitationPeriod: "
                + exploitationPeriod + ", " + "length: "
                + length + ", allowable weight: " + allowableWeightOFTransport;
    }
}
