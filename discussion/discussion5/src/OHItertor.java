import java.util.Iterator;
import java.util.NoSuchElementException;

public class OHItertor implements Iterator<OHRequest>{
    private OHRequest curr;

    public OHItertor(OHRequest request){
        curr = request;
    }

    public static boolean isGood(String description){
        return description.length() >= 5;
    }

    @Override
    public boolean hasNext() {
        while(curr != null && !isGood(curr.description)){
            curr = curr.next;
        }
        if (curr != null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public OHRequest next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        OHRequest currRequest = curr;
        curr = curr.next;
        return currRequest;
    }
}