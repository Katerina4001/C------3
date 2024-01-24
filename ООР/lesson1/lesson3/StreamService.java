package group4386.gerasimava.lesson3;

import java.util.List;

public class StreamService {
    private List<Stream> listStreams;

    public StreamService(List<Stream> listStreams) {
        this.listStreams = listStreams;
    }

    public void sortStudentsStreamBySize(){
        listStreams.sort(new StreamComparator());
    }
    
}