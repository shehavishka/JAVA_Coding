public class Arrays {

    public static void main(String[] args){

        //array: Used to store multiple values ina single variable

        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};

        cars[0] = "Mustang";

        //System.out.println(cars[1]);

        /* String[] cars = new String[3];
        cars[0] = "Mustang"; */

        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }

    }
}
