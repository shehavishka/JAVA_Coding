public class Car {

    String name;
    int doors;
    double weight;

    Car(String name, int doors, double weight){
        this.name = name;
        this.doors = doors;
        this.weight = weight;
    }

    void drifting(){
        System.out.println(this.name + " is drifting.");
    }

    void drive(){
        System.out.println(this.name + " is driving safety.");
    }
}
