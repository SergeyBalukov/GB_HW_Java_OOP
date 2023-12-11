import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> groups;

    public Stream(){
        groups = new ArrayList<>();
    }

    public void addGroup(StudyGroup group){
        groups.add(group);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new StudyGroupIterator(this);
    }

    public List<StudyGroup> getGroupList() {
        return groups;
    }
}
