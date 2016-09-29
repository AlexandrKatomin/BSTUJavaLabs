package ru.bstu.alexandr.lab1;

import com.sun.istack.internal.NotNull;

import java.util.Scanner;
import java.util.prefs.BackingStoreException;

/**
 * Created by Александр on 22.09.2016.
 */
public abstract class Construction {

    //делает private и разбираемся
    int exploitationPeriod;//пока что оставил default так как ломается, еще не освоил get
@NotNull
    public static Construction create(int number) {
        enumConstruction construction = null; //todo а зачем нам тут enum?
        for (enumConstruction a : enumConstruction.values()) //todo А можно этот когд где то в месте связанном с enum?
            if (number == a.ordinal()) {
                construction = a;
                break;
            }
        // todo Правильное ли приминение экзепшена ?
    //fixme RE Эксепшен то не самопальный и определи его от Exception
        if (construction == null)
            throw new RuntimeException("Incorrect Construction code");
//todo    Reflections reflections = new Reflections("my.project.prefix");
//    Set<Class<? extends Object>> allClasses = reflections.getSubTypesOf(Object.class);
        switch (construction) {
            case Supermarket: //Константы должны быть БОЛЬШИМИ
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
        for (enumConstruction a : enumConstruction.values()) {   //можно массив вывести по другому
            System.out.println(a.ordinal() + " - " + a); // todo Вот  это выводить не так надо, у класса есть метод toString()
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

    enum enumConstruction { //todo а почему с маленькой?
        Supermarket, PrivateHouse, ApartmentHouse, Bridge, Tunnel; //todo зачем точка с запятой?
        //todo а если порядок констант поменяю?
    }
}
