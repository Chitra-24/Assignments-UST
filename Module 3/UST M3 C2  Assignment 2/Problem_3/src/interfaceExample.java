
interface Drivable {
    public void move();
}

class Bike2 implements Drivable {
    public void move() {
        System.out.println("Bike is moving");
    }
}

class Car2 implements Drivable {
    public void move() {
        System.out.println("Car is moving");
    }
}

public class interfaceExample {

	public static void main(String[] args) {
		Bike2 bike = new Bike2();
        bike.move();

        Car2 car = new Car2();
        car.move();

	}

}
