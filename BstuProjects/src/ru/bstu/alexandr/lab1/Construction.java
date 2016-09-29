package ru.bstu.alexandr.lab1;

import java.util.Scanner;
import java.util.prefs.BackingStoreException;

/**
 * Created by Александр on 22.09.2016.
 */
public abstract class Construction {

    int exploitationPeriod;//пока что оставил default так как ломается, еще не освоил get

    public static Construction create(int number) {
        enumConstruction construction = null;
        for (enumConstruction a : enumConstruction.values())
            if (number == a.ordinal()) {
                construction = a;
                break;
            }
        // todo Правильное ли приминение экзепшена ?
        if (construction == null)
            throw new RuntimeException("Incorrect Construction code");
        switch (construction) {
            case Supermarket:
                return new Supermarket();
            case PrivateHouse:
                return new PrivateHouse();
            case ApartmentHouse:
                return new ApartmentHouse();
            case Bridge:
                return new Bridge();
            case Tunnel:
                return new Tunnel();
            default:
                throw new RuntimeException("Incorrect Construction code");
        }
    }

    public static void writeAllConstructiond() {
        for (enumConstruction a : enumConstruction.values()) {
            System.out.println(a.ordinal() + " - " + a);
        }
    }

    public void init(Scanner in) {
        exploitationPeriod = readInt(in, "Enter exploitationPeriod: ");
    }

    public int getExploitationPeriod() {
        return this.exploitationPeriod;
    }

    public String toString() {
        return " exploitationPeriod: " + exploitationPeriod;
    }

    protected int readInt(Scanner in, String informMessage) {
        System.out.print(informMessage);
        return in.nextInt();
    }

    enum enumConstruction {
        Supermarket, PrivateHouse, ApartmentHouse, Bridge, Tunnel;
    }
}
