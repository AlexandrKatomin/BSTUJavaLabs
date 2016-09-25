package ru.bstu.alexandr.lab1;
//import ru.bstu.alexandr.lab1.Construction;

/**
 * Created by Александр on 22.09.2016.
 */
public abstract class Building extends Construction {
    int countFloors;

    public static Building create(int type) {
        switch (type) {
            case APARTMENT_HOUSE:
                return new ApartmentHouse();
            case PRIVATE_HOUSE:
                return new PrivateHouse();
            case SUPERMARKET:
                return new Supermarket();
            default:
                throw new RuntimeException("Incorrect Construction code");
        }
    }
}
