import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        int total = 0;
        for (int l : L){
            total += l;
        }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> even = new ArrayList<>();
        for(int l : L){
            if(l%2 == 0){
                even.add(l);
            }
        }
        return even;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> l = new ArrayList<>();
        for(int l1 : L1){
            if(L2.contains(l1)){
                l.add(l1);
            }
        }
        return l;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int occurrence = 0;
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if (word.charAt(i) == c){
                    occurrence +=1;
                }
            }
        }
        return occurrence;
    }
}
