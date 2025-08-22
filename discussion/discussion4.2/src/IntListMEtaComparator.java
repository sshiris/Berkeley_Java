import org.apache.bcel.verifier.statics.IntList;

import java.util.Comparator;

public class IntListMEtaComparator implements Comparator<IntList> {
    private Comparator<Integer> givenC;

    public IntListMEtaComparator(Comparator<Integer> givenC){
        this.givenC = givenC;
    }
    @Override
    public int compare(IntList x, IntList y) {
        if (x== null || y == null){
            return 0;
        }
        int compareValue = givenC.compare(x.first,y.first);
        if(compareValue > 0){
            return compare(x.rest,y.rest) + 1;
        }else if(compareValue < 0){
            return compare(x.rest, y.rest) - 1;
        }else{
            return compare(x.rest, y.rest);
        }
        return 0;
    }
}
//Comparator<Integer> c = new FiveCountComparator(); //compares # of fives
//IntList x = [ 55, 70, 90, 115, 5]; //e.g. 55 has 2 fives
//IntList y = [150, 35, 215, 25];
//IntListMetaComparator ilmc = new IntListMetaComparator(c);
// ilmc.compare(x, y); // returns negative number