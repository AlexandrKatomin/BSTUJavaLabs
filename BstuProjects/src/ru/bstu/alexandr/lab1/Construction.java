package ru.bstu.alexandr.lab1;

import java.util.Scanner;

/**
 * Created by Александр on 22.09.2016.
 */
public abstract class Construction {
    int exploitationPeriod;

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
