package ru.bstu.alexandr.lab1;

import static ru.bstu.alexandr.lab1.WorkWithConst.createArrayConstruction;
import static ru.bstu.alexandr.lab1.WorkWithConst.findMinConstructWithMinExtPeriod;
import static ru.bstu.alexandr.lab1.WorkWithConst.outputConstructWithMinExtPeriod;

// FIXME: вынести в отдельный класс, а тут вызывать методы этого класса
// 23.09.2016
public class Main {

    public static void main(String[] args) {
        Construction[] arrayConstr = createArrayConstruction();
        int numberConst;
        numberConst = findMinConstructWithMinExtPeriod(arrayConstr);
        outputConstructWithMinExtPeriod(arrayConstr, numberConst);
    }
}
