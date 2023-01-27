public class Ship {
    private String shipName;
    private String country;

    Ship(String shipName, String country){
        this.shipName = shipName;
        this.country = country;
    }

    public String toString(){
        return this.shipName + "\n" + this.country + "\n\n";
    }
}
