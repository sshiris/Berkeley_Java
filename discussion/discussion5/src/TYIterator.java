public class TYIterator extends OHItertor {
    public TYIterator(OHRequest request) {
        super(request);
    }
    @Override
    public OHRequest next(){
        OHRequest result = super.next();
        if(result != null && result.description.contains("thank you")){
            result = super.next();
        }
        return result;
    }
}

