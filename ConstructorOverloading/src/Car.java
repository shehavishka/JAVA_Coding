public class Car {
    private String name;
    private int doors;
    private boolean isSport;
    private String color;


    Car(){
        System.out.println("Default constructor is called.");
    }

    Car(String name, int doors, boolean isSport, String color){
        this.name = name;
        this.doors = doors;
        this.isSport = isSport;
        this.color = color;
        System.out.println("4th parameter constructor called.");
    }

    Car(String name, String color){
        this.name = name;
        this.color = color;
        this.doors = 2;
        this.isSport = true;
        System.out.println("second parameter constructor called.");
    }

}
