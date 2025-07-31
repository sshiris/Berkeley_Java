public class Rotate {

    public static int[] rotate(int[] A, int k){
        int rightShift = k % A.length;
        if(rightShift < 0){
            rightShift += A.length;
        }
        int[] newArr = new int[A.length];
        for(int i = 0; i < A.length; i++){
            int newIndex = (i + rightShift)%(A.length);
            newArr[newIndex] = A[i];
        }
        return newArr;
    }

    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,5,6,7};
        int[] new_arr = Rotate.rotate(arr,12);
        for(int newArr : new_arr){
            System.out.print(newArr);
        }
    }
}
