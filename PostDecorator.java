public abstract class PostDecorator implements IPost{
    protected IPost IPost;
    public PostDecorator(IPost IPost){this.IPost=IPost;}
    public String getContent(){return IPost.getContent();}
}