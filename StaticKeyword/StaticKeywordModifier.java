public class StaticKeywordModifier {

    public static void main(String[] args){

        //Static: modifier. A single copy of a variable/method is created and shared.
        //        the class "owns" the static member
        //        eg:- 'Math Class'

        Friend friend1 = new Friend("Norin");
        Friend friend2 = new Friend("Disara");
        Friend friend3 = new Friend("Hiruni");
        Friend friend4 = new Friend(":)");

        //System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
    }
}
