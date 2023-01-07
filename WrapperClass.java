            //Provides a way to use primitive data types as reference data types

public class WrapperClass {

    public static void main(String[] args){

        //Primitive         //Wrapper
        //---------------------------
        //boolean             Boolean
        //char                Character
        //int                 Integer
        //double              Double

        //autoboxing => the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        //unboxing => the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Anu";

        //Act as primitive data type because of unboxing method
        if(b=='@'){
            System.out.println("This is true");
        }



    }


}
