public class AbstractKeyword {

    public static void main(String[] args){

        //abstract: abstract classes cannot be instantiated, but they can have a subclass
        //          abstract methods are declared without an implementation

        //Vehicle_AK vehicle = new Vehicle_AK(); ~because this class is abstract
        Car_AK car = new Car_AK();

        car.go();
    }
}
