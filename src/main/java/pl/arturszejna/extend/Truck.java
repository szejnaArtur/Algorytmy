package pl.arturszejna.extend;

public class Truck extends Vehicle {

    String mark;
    Double height;

    public Truck(String color,
                 Integer seats,
                 Double engineCapacity,
                 String mark,
                 Double height) {
        super(color, seats, engineCapacity);
        this.mark = mark;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "mark='" + mark + '\'' +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
