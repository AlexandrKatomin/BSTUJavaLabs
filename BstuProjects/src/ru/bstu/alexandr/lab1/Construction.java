package ru.bstu.alexandr.lab1;

import java.util.Scanner;
import java.util.prefs.BackingStoreException;

/**
 * Created by Александр on 22.09.2016.
 */
public abstract class Construction {
    static final int SUPERMARKET = 0;
    static final int PRIVATE_HOUSE = 1;
    static final int APARTMENT_HOUSE = 2;
    int exploitationPeriod;

    public static Construction create(int type) {
        if (type > 2) throw new IllegalArgumentException("Incorrect Construction code");
        if (type >= 0 && type <= 2)
            return Building.create(type);
        return null;
    }


    public abstract void init(Scanner scanner);

    public int getExploitationPeriod() {
        return this.exploitationPeriod;
    }

    public abstract String toString();

    protected int readInt(Scanner in, String informMessage) {
        System.out.print(informMessage);
        return in.nextInt();
    }


}
