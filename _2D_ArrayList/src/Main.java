import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Soda");
        drinkList.add("Pepsi");
        drinkList.add("Coca-cola");

        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Dongaa:)");
        fruitsList.add("Mangoose");
        fruitsList.add("Avocado");

        ArrayList<String> vegetableList = new ArrayList<>();
        vegetableList.add("Pumpkin");
        vegetableList.add("Onion");
        vegetableList.add("Bean");
        vegetableList.add("Potato");
        vegetableList.add("Carrot");

        groceryList.add(drinkList);
        groceryList.add(fruitsList);
        groceryList.add(vegetableList);

        for(int i=0; i<groceryList.size(); i++){
            for(int j=0; j< groceryList.get(i).size(); j++){
                System.out.print(groceryList.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}