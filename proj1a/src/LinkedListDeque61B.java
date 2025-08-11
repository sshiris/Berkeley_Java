import java.util.ArrayList;
import java.util.List;

public class LinkedListDeque61B<T> implements Deque61B<T> {
    Node sentinel;
    int size;

    public LinkedListDeque61B(){
        sentinel = new Node(null, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }
    private class Node{
        public T item;
        public Node next;
        public Node prev;

        public Node(Node prev, T item, Node next){
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }
    @Override
    public void addFirst(T x) {
        Node current = sentinel.next;
        Node addFirst = new Node(sentinel, x, current);
        sentinel.next = addFirst;
        current.prev = addFirst;
        size +=1;
    }

    @Override
    public void addLast(T x) {
        Node current = sentinel.prev;
        Node addLast = new Node(current, x, sentinel);
        current.next = addLast;
        sentinel.prev = addLast;
        size += 1;
    }

    @Override
    public List<T> toList() {
        List<T> returnList = new ArrayList<>();
        for (Node current = sentinel.next; current != sentinel; current = current.next ){
            returnList.add(current.item);
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
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T get(int index) {
        if(index>=size || index < 0){
            return null;
        }
        Node current = sentinel.next;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current.item;
    }

    @Override
    public T getRecursive(int index) {
        return null;
    }
}
