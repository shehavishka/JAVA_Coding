public class Car {

    private int gear;
    Car(){
        System.out.println("Car constructor called.");
        gear = 1;
        drifting();
    }

    void drifting(){
        System.out.println("Car is drifting under " + gear);
    }
}
