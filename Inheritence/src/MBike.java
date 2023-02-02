public class MBike extends Vehicle{

    private int engineType;

    //create a constructor
    MBike(int engineType, int speed, double fuelCap){
        super(speed,fuelCap);
        this.engineType = engineType;
    }

    private void stunt(){
        System.out.println("Bike is stunning.");
    }
}
