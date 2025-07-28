/* TODO: Set up this interface so that it covers all common
 * methods to AList and SLList. Also add a default method
 * print that prints a list. */
public interface List61B<Item> {
    public void addFirst(Item x);
    public Item getFirst();
    public void addLast(Item x);
    public Item getLast();
    public Item removeLast();
    public int size();
    public Item get(int i);
    public void insert(Item x, int i);
    default public void print(){
        for(int i = 0; i < size(); i++){
            System.out.print(get(i)+" ");
        }
    }

} 