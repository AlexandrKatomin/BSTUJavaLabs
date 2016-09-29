package ru.bstu.alexandr.lab1;

import java.util.Scanner;

import static ru.bstu.alexandr.lab1.Construction.writeAllConstructiond;

/**
 * Created by Александр on 25.09.2016.
 */
public class WorkWithConst {
    static int writeSelectOfConstruction(Scanner in) { //todo странное название оно выводит или читает?
        int number = 0;
        while (number < 1 || number > 5) { //todo конструкции начинаются с 0. Если человек дурак, он отсюда никогда не выйдет :)
            writeAllConstructiond();
            //todo Это желательно вынести в метод
            System.out.println("Enter of number");
            number = in.nextInt(); //todo тут явная проблема если мы захотим ввести букву
        }
        // todo Это явно ошибочное значение и тут надо использовать exception
        return number - 1;
    }

    static int findMinConstructWithMinExtPeriod(Construction[] constructions) { //todo зачем возвращаем номер?
        if (constructions == null)
            new RuntimeException("araray is empty"); //todo когда вы кинится эта ошибка?
        int min = constructions[0].exploitationPeriod; //todo а что в этой строке нам подсказывает идея? Почему не gettter?
        int numberConstruction = 0;
        for (int i = 0; i < constructions.length; i++) {
            //todo Стоит использовать Arrays.sort(convertedValues); a[0]
            //todo или Collections.min(Arrays.asList(numbers));
            //todo Arrays.stream(numbers).max();
            int explotPeriod = constructions[i].getExploitationPeriod();
            if (explotPeriod < min) {
                min = explotPeriod;
                numberConstruction = i;
            }
        }
        return numberConstruction;
    }

    static void outputConstructWithMinExtPeriod(Construction[] arr, int numberConstWithMin) {
        System.out.println("Construction with min exploitation period"); //todo почему вывод в 2 строки? Передавать в метод объект
        System.out.println(arr[numberConstWithMin]);
    }

    static Construction[] createArrayConstruction() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of Constructions"); //todo в метод
        int countConstruct = in.nextInt();
        Construction[] arrayConstruction = new Construction[countConstruct];
        int numberConstr;// todo какая область видимости этой переменной?

        for (int i = 0; i < arrayConstruction.length; i++) {
            numberConstr = WorkWithConst.writeSelectOfConstruction(in); //что будет есл иубрать имя класса?
            arrayConstruction[i] = Construction.create(numberConstr); //почему не Enum?
            arrayConstruction[i].init(in); //если метод будет возвращать Construct, то получится замыкание
        }
        return arrayConstruction;
    }
}
