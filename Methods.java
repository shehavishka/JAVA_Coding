//Block of code that is executes whenever it is called upon

public class Methods {

    public static void main(String[] args){

        String name = "Anu";
        int age = 23;

        hello(name, age);

        int x = 3;
        int y = 4;

        //add(x, y);
        //int z = add(x, y);
        //System.out.println(z);

        System.out.println(add(x, y));

    }

    static void hello(String name, int age){
        System.out.println("Hello " + name);
        System.out.println("You are "+age+" years old");
    }

    static int add(int x, int y){

        //return(x+y);

        int z = x+y;
        return z;

    }
}
