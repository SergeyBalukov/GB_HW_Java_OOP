import java.util.List;

public class StudyGroup {
    private int groupId;
    private String groupName;

    public StudyGroup(int groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }


    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

       public List<StudyGroup> getStudyGroupList() {
        return getStudyGroupList();
    }


    @Override
    public String toString() {
        return "StudyGroup{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
