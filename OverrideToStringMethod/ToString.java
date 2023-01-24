public class ToString {

    //toString = Special method that all objects inherit
    //           That returns a string that "textually represents" an object.
    //           Can be used both implicitly and explicitly

    public static void main(String[] args){
        Car car = new Car();

        //System.out.println(car);    // Print the car object address in the memory(Without toString Method)

        System.out.println(car.toString()); //explicitly
        System.out.println(car); //implicitly
    }
}
