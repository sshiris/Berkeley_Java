import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        TreeMap<Character, Integer> tm = new TreeMap<>();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < letters.length(); i++) {
            tm.put(letters.charAt(i),i+1);
        }
        return tm;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> m = new TreeMap<>();
        for (int key : nums) {
            int value = key * key;
            m.put(key, value);
        }
        return m;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> m= new TreeMap<>();
        for(String key : words){
            int value = 0;
            for (int i = 0; i < words.size(); i++) {
                if(key.equals(words.get(i)) ){
                    value +=1;
                }
            }
            if(!m.containsKey(key)){
                m.put(key,value);
            }
        }
        return m;
    }
}
