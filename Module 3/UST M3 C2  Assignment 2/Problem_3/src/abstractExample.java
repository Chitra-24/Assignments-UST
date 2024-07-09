abstract class Vehicle {
    public abstract void run();
}

class Bike extends Vehicle {
    public void run() {
        System.out.println("Bike is running");
    }
}

class Car extends Vehicle {
    public void run() {
        System.out.println("Car is running");
    }
}

public class abstractExample {

	public static void main(String[] args) {
		Bike bike = new Bike();
        bike.run();

        Car car = new Car();
        car.run();

	}

}
