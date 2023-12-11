import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<StudyGroup> {
    private List<StudyGroup> groupList;
    private int counter;

    public StudyGroupIterator(Stream stream){
        this.groupList = stream.getGroupList();
        counter  = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < groupList.size();
    }

    @Override
    public StudyGroup next() {
        if(hasNext()){
            return groupList.get(counter ++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext());
        groupList.remove(counter);

    }
}
