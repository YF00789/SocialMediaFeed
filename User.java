public class User implements IObserver{
    private String name;
    public User(String name){this.name=name;}
    public void update(IPost IPost){
        System.out.println(name+" received update: "+IPost.getContent());
    }
}