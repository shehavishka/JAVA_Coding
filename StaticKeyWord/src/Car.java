public class Car {

    private String name;
    private int model;

    static int numberOfCars = 0;

    Car(String name, int model){
        this.name = name;
        this.model = model;
        numberOfCars ++;
    }

    public static void displayNumberOfCars(){
        System.out.println("You have created " + numberOfCars + " cars.");
    }


}
