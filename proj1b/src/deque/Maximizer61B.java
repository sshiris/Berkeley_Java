package deque;
import java.util.Comparator;
import java.util.Iterator;

public class Maximizer61B {
    /**
     * Returns the maximum element from the given iterable of comparables.
     * You may assume that the iterable contains no nulls.
     *
     * @param iterable  the Iterable of T
     * @return          the maximum element
     */
    public static <T extends Comparable<T>> T max(Iterable<T> iterable) {
//        if(iterable == null){
//            return null;
//        }
//        T maxSoFar = null;
//        for(T item : iterable){
//           if(maxSoFar == null || item.compareTo(maxSoFar) > 0){
//               maxSoFar = item;
//           }
//        }
//        return maxSoFar;

        Iterator<T> iterator = iterable.iterator();
        if(!iterator.hasNext()){
            return null;
        }
        T maxSoFar = iterator.next();
        while(iterator.hasNext()){
            T nextItem = iterator.next();
            if(nextItem.compareTo(maxSoFar)>0){
                maxSoFar = nextItem;
            }
        }
        return maxSoFar;
    }

    /**
     * Returns the maximum element from the given iterable according to the specified comparator.
     * You may assume that the iterable contains no nulls.
     *
     * @param iterable  the Iterable of T
     * @param comp      the Comparator to compare elements
     * @return          the maximum element according to the comparator
     */
    public static <T> T max(Iterable<T> iterable, Comparator<T> comp) {
        Iterator<T> iterator = iterable.iterator();
        T maxSoFar = iterator.next();
        while(iterator.hasNext()){
            T nextItem = iterator.next();
            int result = comp.compare(maxSoFar,nextItem);
            if(result < 0){
                maxSoFar = nextItem;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
         ArrayDeque61B<Integer> ad = new ArrayDeque61B<>();
         ad.addLast(5);
         ad.addLast(12);
         ad.addLast(17);
         ad.addLast(23);
         System.out.println(max(ad));
    }
}
