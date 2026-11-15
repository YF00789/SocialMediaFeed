public class PostFactory{
    public static IPost createPost(String type, String text){
        if (type.equalsIgnoreCase("ad")){
            return new ThirdPartyAdapter(new ThirdPartyAPI());
        }
        return new BasicPost(text);
    }
}