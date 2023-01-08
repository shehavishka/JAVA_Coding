public class OOP {

    public static void main(String[] args){

        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);

        System.out.println("\n//Object02");

        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

        System.out.println("\n//Methods");
        myCar.drive();
        myCar.brake();

    }
}




