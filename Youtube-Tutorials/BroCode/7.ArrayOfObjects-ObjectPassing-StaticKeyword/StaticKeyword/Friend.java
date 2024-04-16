public class Friend {
    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    String name;
    static int numberOfFriends;
    static void countFriends() {
        System.out.println("You have "+numberOfFriends+" friends.");
    }
}
