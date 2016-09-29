package ru.bstu.alexandr.lab1;

import java.util.Scanner;

import static ru.bstu.alexandr.lab1.Construction.writeAllConstructiond;

/**
 * Created by Александр on 25.09.2016.
 */
public class WorkWithConst {
    static int writeSelectOfConstruction(Scanner in) {
        int number = 0;
        while (number < 1 || number > 5) {
            System.out.println("Enter of number");
            writeAllConstructiond();
            number = in.nextInt();
        }
        return number - 1;
    }

    static int findMinConstructWithMinExtPeriod(Construction[] constructions) {
        if (constructions == null)
            new RuntimeException("araray is empty");
        int min = constructions[0].exploitationPeriod;
        int numberConstruction = 0;
        for (int i = 0; i < constructions.length; i++) {
            int explotPeriod = constructions[i].getExploitationPeriod();
            if (explotPeriod < min) {
                min = explotPeriod;
                numberConstruction = i;
            }
        }
        return numberConstruction;
    }

    static void outputConstructWithMinExtPeriod(Construction[] arr, int numberConstWithMin) {
        System.out.println("Construction with min exploitation period");
        System.out.println(arr[numberConstWithMin]);
    }

    static Construction[] createArrayConstruction() {
        System.out.println("Enter count of Constructions");
        Scanner in = new Scanner(System.in);
        int countConstruct = in.nextInt();
        Construction[] arrayConstruction = new Construction[countConstruct];
        int numberConstr;

        for (int i = 0; i < arrayConstruction.length; i++) {
            numberConstr = WorkWithConst.writeSelectOfConstruction(in);
            arrayConstruction[i] = Construction.create(numberConstr);
            arrayConstruction[i].init(in);
        }
        return arrayConstruction;
    }
}
