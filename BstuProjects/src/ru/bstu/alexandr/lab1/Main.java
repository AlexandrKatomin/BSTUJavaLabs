package ru.bstu.alexandr.lab1;
import java.util.Scanner;

import static ru.bstu.alexandr.lab1.WorkWithConst.findMinConstructWithMinExtPeriod;
import static ru.bstu.alexandr.lab1.WorkWithConst.outputConstructWithMinExtPeriod;
import static ru.bstu.alexandr.lab1.WorkWithConst.createArrayConstruction;

// FIXME: вынести в отдельный класс, а тут вызывать методы этого класса
// 23.09.2016
public class Main {

    public static void main(String[] args) {
        Construction a = new Supermarket();
        Scanner in = new Scanner(System.in);
        a.init(in);
        System.out.print(a);

        Construction[] arrayConstr = createArrayConstruction();
        int numberConst;
        numberConst = findMinConstructWithMinExtPeriod(arrayConstr);
        outputConstructWithMinExtPeriod(arrayConstr, numberConst);
    }
}
