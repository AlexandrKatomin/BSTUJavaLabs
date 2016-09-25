package ru.bstu.alexandr.lab1;
import java.util.Scanner;

// FIXME: вынести в отдельный класс, а тут вызывать методы этого класса
// 23.09.2016
public class Main {

    public static void main(String[] args) {
        Construction[] arrayConstr = WorkWithConst.createArrayConstruction();
        int numberConst;
        numberConst = WorkWithConst.findMinConstructWithMinExtPeriod(arrayConstr);
        WorkWithConst.outputConstructWithMinExtPeriod(arrayConstr, numberConst);
    }
}
