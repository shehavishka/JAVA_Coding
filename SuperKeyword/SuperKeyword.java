public class SuperKeyword {

    public static void main(String[] args) {

        //super: refers to the parent of an object
        //       similar to 'this' keyword

        Hero hero1 = new Hero("Batman", 30, "$$$");
        Hero hero2 = new Hero("Superman", 20, "everything");

        //System.out.println(hero1.name);
        //System.out.println(hero1.age);
        //System.out.println(hero1.power);

        System.out.println(hero2.toString());

    }
}
