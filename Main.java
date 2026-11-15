public class Main{
    public static void main(String[] args){
        SocialMediaFacade app = new SocialMediaFacade();
        User user1 = new User("User A");
        User user2 = new User("User B");
        app.registerUser(user1);
        app.registerUser(user2);
        app.publishPost("standard", "Having a great day!", true);
        app.publishPost("ad", "", false);
        System.out.println("\nComplete Feed");
        app.displayFeed();
    }
}