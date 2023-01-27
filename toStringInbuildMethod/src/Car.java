public class Car {
    private String name;
    private String engineNumber;

    Car(String name, String engineNumber){
        this.name = name;
        this.engineNumber = engineNumber;
    }

    public String toString(){
        return this.name + "\n" + this.engineNumber;
    }
}
