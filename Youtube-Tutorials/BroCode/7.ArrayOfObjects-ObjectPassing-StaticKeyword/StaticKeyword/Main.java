public class Main {
    public static void main(String[] args) {

        // static = Modifier. A single coppy of a variable/method is created and shared. This modifier stays for the class only!
        // The class "owns" the static member.

        Friend friend1 = new Friend("Pavel");
        Friend friend2 = new Friend("Mitko");
        Friend friend3 = new Friend("Strahil");

        System.out.println(Friend.numberOfFriends);
        Friend.countFriends();
    }
}
