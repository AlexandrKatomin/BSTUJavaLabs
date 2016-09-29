package ru.bstu.alexandr.lab1;

import java.util.Scanner;

/**
 * Created by Александр on 26.09.2016.
 */
public class Bridge extends RoadConstruction {
    private int allowableWeightOFTransport; //допустимый вес

    @Override
    public void init(Scanner in) {
        super.init(in);
        allowableWeightOFTransport = readInt(in, "Enter allowable weight: ");
    }

    public String toString() {
        return "It is  Bridge; " + super.toString()
                + ", allowable weight: " + allowableWeightOFTransport;
    }
}
