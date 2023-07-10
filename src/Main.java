
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

abstract class Vehicle{
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle{
    public void start(){
        System.out.println("Car Started");
    }

    public void stop(){
        System.out.println("Car Stopped");
    }
}

class Motorcycle extends Vehicle{
    public void start(){
        System.out.println("Motorcycle started");
    }

    public void stop(){
        System.out.println("Motorcycle stopped");
    }
}
public class Main{
    public static void main(String[] args) {
        Motorcycle royalEnfield = new Motorcycle();
        Car baleno = new Car();
        royalEnfield.start();
        royalEnfield.stop();

        baleno.start();
        baleno.stop();
    }
}