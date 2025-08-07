public class RemoveDuplicates {
    Node sentinal;
    public RemoveDuplicates(){
        //...
    }
    public class Node{
        int item;
        Node pre;
        Node next;
    }
    public void removeDuplicates(){
        Node ref = sentinal.next;
        Node checker;
        while(ref!=sentinal){
            checker=ref.next;
            while (checker!=sentinal){
                if (checker.item == ref.item){
                    Node checPrev = checker.pre;
                    Node checNext = checker.next;
                    checPrev.next = checker.next;
                    checNext.pre = checker.pre;
                    checker = checker.next;
                }else {}
                checker=checker.next;
            }
            ref = ref.next;
        }
    }
}
