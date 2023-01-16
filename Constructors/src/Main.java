public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");


        // create a object
        Car car1 = new Car("Tesla",2,23.2);
        Car car2 = new Car("Ferrari", 4, 52.2);

        car2.drifting();
        car1.drive();

    }
}