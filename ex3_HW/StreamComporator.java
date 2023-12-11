import java.util.Comparator;

public class StreamComporator implements Comparator<StudyGroup> {
    @Override
    public int compare(StudyGroup o1, StudyGroup o2) {
        int resultOfComparing = o1.getGroupName().compareTo(o2.getGroupName());

        return resultOfComparing;
    }
}
