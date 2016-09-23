package ru.bstu.alexandr.lab1;

import ru.bstu.alexandr.lab1.market.ApartmentHouse;
import ru.bstu.alexandr.lab1.market.Construction;
import ru.bstu.alexandr.lab1.market.PrivateHouse;
import ru.bstu.alexandr.lab1.market.Supermarket;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter count of Constructions");
        Scanner in = new Scanner(System.in);
        int countConstruct = in.nextInt();
        Construction[] allConstruction = new Construction[countConstruct];
        int numberConstr;

        for (int i = 0; i < allConstruction.length; i++) {
            numberConstr = writeSelectOfConstruction(in);
            allConstruction[i] = selectConstruction(numberConstr);
            allConstruction[i].init(in);
        }
        int numberConst;


        numberConst = minConstructWithMinExtPeriod(allConstruction);
        //System.out.println("Construction with min exploitation period");
        System.out.println(allConstruction[numberConst].toString());


    }

    private static int writeSelectOfConstruction(Scanner in) {
        int number = 0;
        //Scanner in = new Scanner(System.in)
        while (number < 1 || number > 3) {
            System.out.println("Enter 1 -  supermarket, 2 - privateHouse, 3 - ApartmentHouse");
            number = in.nextInt();
        }
        return number;
    }

    private static Construction selectConstruction(int number) {
        Construction construction;
        switch (number) {
            case 1:
                construction = new Supermarket();
                break;
            case 2:
                construction = new PrivateHouse();
                break;
            default:
                construction = new ApartmentHouse();
                break;
        }
        return construction;
    }

    private static int minConstructWithMinExtPeriod(Construction[] constructions) {
        int min = 32000;
        int numberConstruction = -1;
        for (int i = 0; i < constructions.length; i++) {
            int explotPeriod = constructions[i].getExploitationPeriod();
            if (explotPeriod < min) {
                min = explotPeriod;
                numberConstruction = i;
            }
        }
        return numberConstruction;
    }
}
