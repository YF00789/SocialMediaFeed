import java.util.ArrayList;
import java.util.List;
public class SocialMediaFacade{
    private Feed feed = new Feed();
    private List<IPost> IPosts = new ArrayList<>();
    private ISortStrategy ISortStrategy = new ChronologicalISort();
    public void registerUser(User user){feed.addObserver(user);}
    public void setSortStrategy(ISortStrategy strategy){this.ISortStrategy=strategy;}
    public void publishPost(String type, String text, boolean addEmoji){
        IPost IPost = PostFactory.createPost(type, text);
        if (addEmoji){
            IPost = new EmojiFilter(IPost);
        }
        IPosts.add(IPost);
        feed.notifyObservers(IPost);
    }
    public void displayFeed(){
        List<IPost> sortedIPosts = ISortStrategy.sort(IPosts);
        for (IPost p : sortedIPosts){
            System.out.println("Feed item: "+p.getContent());
        }
    }
}