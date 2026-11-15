import java.util.ArrayList;
import java.util.List;
public class ChronologicalISort implements ISortStrategy{
    public List<IPost> sort(List<IPost> IPosts){
        return new ArrayList<>(IPosts);
    }
}