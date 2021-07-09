package pl.arturszejna.extend;

public final class SUV extends Car{

    Double weight;

    public SUV(String color,
               Integer seats,
               Double engineCapacity,
               String mark,
               Boolean isManualGearbox,
               String type,
               Double weight) {
        super(color, seats, engineCapacity, mark, isManualGearbox, type);
        this.weight = weight;
    }
}
