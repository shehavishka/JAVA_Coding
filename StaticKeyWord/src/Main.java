public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car1 = new Car("Lamborghini", 12);
        Car car2 = new Car("Pagani", 2275);
        Car car3 = new Car("Hudson",151458 );

        System.out.print("Access static variable -> "+ Car.numberOfCars + "\n");

        System.out.print("Access Static method -> ");
        Car.displayNumberOfCars();

    }
}