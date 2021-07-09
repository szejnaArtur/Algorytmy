package pl.arturszejna.extend;

public final class SUV2 extends Car{

    Double weight;

    public SUV2(String color,
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
