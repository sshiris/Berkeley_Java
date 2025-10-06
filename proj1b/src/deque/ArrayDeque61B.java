package deque;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayDeque61B<T> implements Deque61B<T>, Iterable<T>{
    private int size;
    private int frontPosition;
    private int backPosition;
    private T[] items;

    public ArrayDeque61B(){
        frontPosition = 0;
        backPosition = 0;
        items =(T[]) new Object[8];
        size = 0;
    }

    @Override
    public void addFirst(T x) {
        if(size == items.length){
            resize(items.length*2);
        }
        frontPosition = Math.floorMod(frontPosition-1, items.length);// we want the first element to be added in the last at starting position 0
        items[frontPosition] = x;
        size +=1;
    }

    @Override
    public void addLast(T x) {
        if(size == items.length){
            resize(items.length*2);
        }
        items[backPosition] = x;
        backPosition = Math.floorMod(backPosition+1, items.length);
        size += 1;
    }
    private void resize(int capacity){
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i]=get(i);
        }
        items = newArray;
        frontPosition = 0;
        backPosition = size;
    }

    @Override
    public List<T> toList() {
        List<T> returnList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            returnList.add(get(i));
        }
        return returnList;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T removeFirst() {
        if(size == 0){
            return null;
        }
        T first = items[frontPosition];
        items[frontPosition]= null;
        frontPosition = (frontPosition+1)%items.length;
        size -=1;
        return first;
    }

    @Override
    public T removeLast() {
        if(size == 0){
            return null;
        }
        backPosition = (backPosition-1 + items.length)% items.length;
        T last = items[backPosition];
        items[backPosition]= null;
        size--;
        return last;
    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0)
        {
            return null;
        }
        int actualIndex = (frontPosition+index)% items.length;
        return items[actualIndex];
    }

    @Override
    public T getRecursive(int index) {
        throw new UnsupportedOperationException("No need to implement getRecursive for proj 1b");
    }

    @Override
    public Iterator<T> iterator() {
        return new Arraydeque61BIterator();
    }
    private class Arraydeque61BIterator implements Iterator<T>{
        public int position;
        public Arraydeque61BIterator(){
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public T next() {
            T item = get(position);
            position++;
            return item;
        }
    }
}
