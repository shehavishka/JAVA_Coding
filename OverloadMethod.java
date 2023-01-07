//Share the same name but have different parameters
//method name + parameters = method signature

import java.util.stream.StreamSupport;

public class OverloadMethod {

    public static void main(String[] args){

        int x = add(1,2);
        System.out.println(x);

        int y = add(1,2, 3);
        System.out.println(y);

        double z = add(1.1,2.1, 3.2, 3.6);
        System.out.println(z);

    }

    static int add(int a, int b){
        System.out.println("This is overload method #1");
        return a+b;
    }

    static int add(int a, int b, int c){
        System.out.println("This is overload method #2");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d){
        System.out.println("This is overload method #3");
        return a+b+c+d;
    }

    static double add(double a, double b){
        System.out.println("This is overload method #4");
        return a+b;
    }

    static double add(double a, double b, double c){
        System.out.println("This is overload method #5");
        return a+b+c;
    }

    static double add(double a, double b, double c, double d){
        System.out.println("This is overload method #6");
        return a+b+c+d;
    }


}
