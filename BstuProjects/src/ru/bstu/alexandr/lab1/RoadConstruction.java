package ru.bstu.alexandr.lab1;

/**
 * Created by Александр on 26.09.2016.
 */
public abstract class RoadConstruction extends Construction {
    int length;

    public static RoadConstruction create(int type) {
        switch (type) {
            case BRIDGE:
                return new Bridge();
            case TUNNEL:
                return new Tunnel();
            default:
                throw new RuntimeException("Incorrect RoadConstruction code");
        }
    }
}
