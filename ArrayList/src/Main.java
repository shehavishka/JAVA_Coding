import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Shehaan");
        nameList.add("Dinusha");
        nameList.add("Heshan");

        nameList.set(2,"Avishka");
        nameList.remove(1);
        nameList.clear();


        for(int i=0; i< nameList.size(); ++i){
            System.out.println(nameList.get(i));
        }
    }
}