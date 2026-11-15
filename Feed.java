import java.util.ArrayList;
import java.util.List;
public class Feed{
    private List<IObserver> IObservers = new ArrayList<>();
    public void addObserver(IObserver o){
        IObservers.add(o);}
    public void notifyObservers(IPost IPost){
        for (IObserver o : IObservers){
            o.update(IPost);
        }
    }
}