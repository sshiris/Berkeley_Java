package deque;

import java.util.LinkedList;
import java.util.List;

public class ArrayDeque61B<T> implements Deque61B<T>{
    int size;
    int frontPosition;
    int backPosition;
    private T[] items;
    public int count;

    public ArrayDeque61B(){
        size = 8;
        count = 0;
        frontPosition = 0;
        backPosition = 0;
        items =(T[]) new Object[size];
    }

    @Override
    public void addFirst(T x) {
        frontPosition = Math.floorMod(frontPosition-1, size);// we want the first element to be added in the last at starting position 0
        items[frontPosition] = x;
        count +=1;
    }

    @Override
    public void addLast(T x) {
        items[backPosition] = x;
        backPosition = Math.floorMod(backPosition+1, size);
        count += 1;
    }

    @Override
    public List<T> toList() {
        return List.of();
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0){
            return null;
        }
        return items[index];
    }

    @Override
    public T getRecursive(int index) {
        return null;
    }
}
