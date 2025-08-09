import java.util.List;

public class LinkedListDeque61B<T> implements Deque61B<T> {
    Node sentinel;
    int size;

    public LinkedListDeque61B(){
        sentinel = new Node(null, null, null);
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

    }

    @Override
    public void addLast(T x) {

    }

    @Override
    public List<T> toList() {
        return List.of();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
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
        return null;
    }

    @Override
    public T getRecursive(int index) {
        return null;
    }
}
