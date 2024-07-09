
abstract class Vehicle1 {

    public void startEngine() {
        System.out.println("Engine started");
    }
    public abstract void move();
}

class Bike1 extends Vehicle1 {
    public void move() {
        System.out.println("Bike is moving");
    }
}

class Car1 extends Vehicle1 {
    public void move() {
        System.out.println("Car is moving");
    }
}
public class abstractExample2 {

	public static void main(String[] args) {
		Bike1 bike = new Bike1();
        bike.startEngine();
        bike.move();

        Car1 car = new Car1();
        car.startEngine();
        car.move();

	}

}
