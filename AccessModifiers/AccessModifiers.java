                    //Modifier      //Class     //Package       //Subclass      //World

                    //public            Y           Y                Y              Y
                    //protected         Y           Y                Y              N
                    //no modifier       Y           Y                N              N
                    //private           Y           N                N              N

                    import package2.C;

public class AccessModifiers {

    public static void main(String[] args){
        //TODO Auto-generated method stub

        C c = new C();
        System.out.println(c.publicMessage);

    }


}
