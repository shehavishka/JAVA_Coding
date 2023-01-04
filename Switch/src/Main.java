public class Main {
    public static void main(String[] args) {

        String day = "monday";

        switch(day){
            case "monday":
                System.out.println("It's monday");
                break;
            case "wednesday":
                System.out.println("wednesday");break;
            case "thursday":
                System.out.println("It's thursday");break;
            case "friday":
                System.out.println("It's friday");break;
            case "saturday":
                System.out.println("It's saturday");break;
            default:
                System.out.println("COULD NOT CATCH THE DAY!!!");

        }

    }
}