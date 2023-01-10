public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println(myCar.color);
        System.out.println(myCar.wheels);
        System.out.println(myCar.doors);

        myCar.driveFast();
        myCar.driveSlow();
    }
}