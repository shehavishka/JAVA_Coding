public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(addNumbers(2,3));
        System.out.println(addNumbers(2,3,5));
        System.out.println(addNumbers(2,3,5,7));

    }

    static int addNumbers(int x, int y){
        return x+y;
    }

    static int addNumbers(int x, int y, int z){
        return x+y+z;
    }

    static int addNumbers(int x, int y, int z, int t){
        return x+y+z+t;
    }
}