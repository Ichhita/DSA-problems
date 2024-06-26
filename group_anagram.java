package Arrays;
import java.util.*;

public class group_anagram {

 private static void printAnagrams(String arr[])
 {
     HashMap<String, List<String> > map = new HashMap<>();
     for (int i = 0; i < arr.length; i++) {
         String word = arr[i];
         char[] letters = word.toCharArray();
         Arrays.sort(letters);
         String newWord = new String(letters);
         if (map.containsKey(newWord)) {
             map.get(newWord).add(word);
         }
         else {

             List<String> words = new ArrayList<>();
             words.add(word);
             map.put(newWord, words);
         }
     }

     for (String s : map.keySet()) {
         List<String> values = map.get(s);
         if (values.size() > 1) {
             System.out.print(values);
         }
     }
 }

 public static void main(String[] args)
 {
     String a[]   = { "listen", "netsil", "tac", "god", "act" };
     System.out.println("List of anagrams are:");
     printAnagrams(a);
 }
}
