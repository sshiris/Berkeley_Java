public interface MyStack <E>{
    void push(E element);
    E pop();
    boolean isEmpty();
    int size();

    private void insertAtBottom(E item){
        if(isEmpty()){
            push(item);
            return;
        }
        E topItem = pop();
        insertAtBottom(item);
        push(topItem);
    }
    default void flip(){
        if (isEmpty()){
            return;
        }

        E topItem = pop();
        flip();
        insertAtBottom(topItem);
    }
}
