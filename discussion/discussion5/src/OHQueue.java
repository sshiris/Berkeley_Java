import java.util.Iterator;

public class OHQueue implements Iterable<OHRequest> {
    private OHRequest queue;

    public OHQueue(OHRequest queue) {
        this.queue = queue;
    }

    @Override
    public Iterator<OHRequest> iterator() {
        return new OHItertor(queue);
    }
}
