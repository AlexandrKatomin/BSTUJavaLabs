package ru.bstu.alexandr.lab1;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Александр on 22.09.2016.
 */
public abstract class Construction {

    //todo делает private и разбираемся
    int exploitationPeriod;//пока что оставил default так как ломается, еще не освоил get

    @NotNull
    public static Construction create(EnumConstruction typeConstruction) throws Exception {
        return typeConstruction.getConstructionClass().newInstance();
    }

    public static void writeAllConstructions() {
        System.out.println(Arrays.toString(EnumConstruction.values())); // todo Вот  это выводить не так надо, у класса есть метод toString()
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

    enum EnumConstruction { //todo а почему с маленькой?
        SUPERMARKET(Construction.class, "Супермаркет"),
        PRIVATE_HOUSE(PrivateHouse.class),
        APARTMENT_HOUSE(ru.bstu.alexandr.lab1.ApartmentHouse.class),
        Bridge,
        TUNNEL; //todo зачем точка с запятой?

        Class<? extends Construction> constructionClass;
        String lname;

        EnumConstruction(Class<? extends Construction> constructionClass, String localazableame) {
            this.constructionClass = constructionClass;
            lname = localazableame;
        }

        //todo а если порядок констант поменяю?
        public static EnumConstruction valueOfInt(int typeConstruction) {
            for (EnumConstruction a : EnumConstruction.values()) {//todo А можно этот когд где то в месте связанном с enum?
                if (typeConstruction == a.ordinal()) {
                    return a;
                }
            }
            throw new IllegalStateException(); //здеть будет мой эксепшен! :)
        }

        @Override
        public String toString() {
            return ordinal() + " - " + name();
        }

        public Class<Construction> getConstructionClass() {
            return constructionClass;
        }
    }
}
