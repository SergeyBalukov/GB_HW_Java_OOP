import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamGroupService {
    private Stream stream;

    public StreamGroupService(Stream stream){
        this.stream = stream;
    }

    public Stream getStream(){
        return stream;
    }

    //public List<Stream> getSortedStudyStream(){
    //    List<Stream> streamList = new ArrayList<>(stream.getStreamList());
    //    Collections.sort(streamList);
    //    return  getSortedStudyStream();
    //}
}
