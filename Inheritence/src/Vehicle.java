public class Vehicle {

    int speed;
    double fuelCapacity;

    Vehicle(int speed, double fuelCapacity){
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    void go(){
        System.out.println("Vehicle is moving " + speed);
    }

    void stop(){
        System.out.println("Vehicle is stopping");
    }
}
