import java.util.Iterator;
import java.util.NoSuchElementException;

public class OHItertor implements Iterator<OHRequest>{
    private OHRequest curr;

    public OHItertor(OHRequest request){
        request = curr;
    }

    public static boolean isGood(String description){
        return description.length() >= 5;
    }

    @Override
    public boolean hasNext() {
        while(!isGood(curr.description) && curr.next != null){
            curr = curr.next;
        }
        if (curr.next != null){
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