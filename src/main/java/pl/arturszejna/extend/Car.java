package pl.arturszejna.extend;

public class Car extends Vehicle{

    String mark;
    Boolean isManualGearbox;
    String type;

    public Car(String color, Integer seats, Double engineCapacity, String mark, Boolean isManualGearbox , String type) {
        super(color, seats, engineCapacity);
        this.mark = mark;
        this.isManualGearbox = isManualGearbox;
        this.type = type;
    }

    public Car(String color, Integer seats, String mark, Boolean isManualGearbox , String type) {
        super(color, seats);
        this.mark = mark;
        this.isManualGearbox = isManualGearbox;
        this.type = type;
    }

    public Car(String color, String mark, Boolean isManualGearbox , String type) {
        super(color);
        this.mark = mark;
        this.isManualGearbox = isManualGearbox;
        this.type = type;
    }

    @Override
    public void startEngine() {
        System.out.println(mark + ": Force driver to fasten seat belts.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", isManualGearbox=" + isManualGearbox +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
