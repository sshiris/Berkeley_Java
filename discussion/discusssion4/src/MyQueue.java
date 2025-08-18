import java.util.Comparator;

public interface MyQueue<E> {
    void enqueue(E element);
    E dequeue();
    boolean isEmpty();
    int size();

    // removes all items from the queue
    default void clear(){
        while(!isEmpty()){
            dequeue();
        }
    };

    // removes all items equal to item from the queue
    // the remaining items should be in the same order as they were before
    default void remove(E item){
        int remove = 0;
        int size = size();
        while(remove < size){
            E current = dequeue();
            if (!current.equals(item)){
                enqueue(current);
            }
            remove ++;
        };

    };

    // returns the maximum element in the queue according to the comparator
    // the items in the queue should be in the same order as they were before
    // assume the queue is not empty
    default E max(Comparator<E> c){
        int remove = 0;
        int size = size();
        E max = null;
        while(remove < size){
            E current = dequeue();

            if (max == null){
                max = current;
            } else if (c.compare(current,max)>0){
                max = current;
            }

            enqueue(current);
            remove ++;
        }
        return max;
    };

}
