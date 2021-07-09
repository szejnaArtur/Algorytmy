package pl.arturszejna.extend;

public abstract class Vehicle {
    protected static Integer carNumber = 0;
    protected String color;
    protected Integer seats;
    protected Double engineCapacity;

    public Vehicle(String color, Integer seats, Double engineCapacity) {
        this.color = color;
        this.seats = seats;
        this.engineCapacity = engineCapacity;
        addCar();
    }

    public Vehicle(String color, Integer seats) {
        this.color = color;
        this.seats = seats;
        addCar();
    }

    public Vehicle(String color) {
        this.color = color;
        addCar();
    }

    protected Integer howManyCars(){
        return carNumber;
    }

    protected void addCar(){
        ++carNumber;
    }

    public void startEngine() {
        System.out.println("Engine starts. Brum brum brum.");
    }

}
