public class Inheritance {

    public static void main(String[] args){

        //inheritance: the process where one class acquires,
        //              the attributes and methods of another

        Jeep jeep = new Jeep();
        jeep.go();

        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(jeep.speed);
        System.out.println(bike.speed);

        System.out.println(jeep.doors);
        System.out.println(bike.pedals);
    }
}
