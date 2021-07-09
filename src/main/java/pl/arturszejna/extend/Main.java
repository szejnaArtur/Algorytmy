package pl.arturszejna.extend;

public class Main {
    public static void main(String[] args) {

        Car opel = new Car("Red", 5, "Astra", false, "combi");
        Car peugeot = new Car("Black", 5, 1.8, "306 SW", false, "combi");
        Car mazda = new Car("Red", "CX-5", false, "combi");
        Truck man = new Truck("blue", 2, 5.2, "man", 3.5);

        System.out.println(opel);
        System.out.println(peugeot);
        System.out.println(mazda);
        System.out.println(man);
        System.out.println(opel.howManyCars());
        opel.startEngine();
        man.startEngine();
    }
}
