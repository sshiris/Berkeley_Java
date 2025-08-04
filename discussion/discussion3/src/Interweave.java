public class Interweave {
    public static class IntList {
        int val;
        IntList rest;

        IntList(int val, IntList rest) {
            this.val = val;
            this.rest = rest;
        }
        static IntList reverse(IntList head) {
            IntList prev = null;
            while (head != null) {
                IntList next = head.rest;
                head.rest = prev;
                prev = head;
                head = next;
            }
            return prev;
        }
    }


    public static IntList[] interweave(IntList lst, int k){
        IntList[] array = new IntList[k];
        int index = k - 1;
        IntList l = IntList.reverse(lst);
        while(l != null){
            IntList preArray = array[index];
            IntList next = l.rest;
            array[index] = l;
            array[index].rest = preArray;//this step will change the L.rest list, so before we change it we need to let next point to the rest so it doest get lost
            l = next;
            index = (1+index)%2;
        }
        return array;
    }
    public static void main(String[] args){
        IntList list = new IntList(1, new IntList(2, new IntList(3, new IntList(4, null))));
        IntList[] result = interweave(list, 2);
        for (int i = 0; i < 2; i++) {
            System.out.print("List " + i + ": ");
            IntList curr = result[i];
            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.rest;
            }
            System.out.println();
        }

    }
}
