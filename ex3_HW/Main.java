import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup group1 = new StudyGroup(1, "dsdad");
        StudyGroup group2 = new StudyGroup(2, "dsdaewrwerd");
        StudyGroup group3 = new StudyGroup(3, "dsdweead");
        StudyGroup group4 = new StudyGroup(4, "dswerwrdad");

        Stream stream1 = new Stream();
        stream1.addGroup(group1);
        stream1.addGroup(group2);

        Stream stream2 = new Stream();
        stream2.addGroup(group3);
        stream2.addGroup(group4);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        for(Stream stream : streams){
            System.out.println("Поток: ");
            for(StudyGroup group : stream){
                System.out.println("-" + group.getGroupName());
            }
        }
    }
}
