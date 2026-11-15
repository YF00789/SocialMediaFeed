public class EmojiFilter extends PostDecorator{
    public EmojiFilter(IPost IPost){super(IPost);}
    public String getContent(){
        return IPost.getContent()+" 😀";
    }
}