//Longest substring without repitition
package Arrays;

import java.util.HashSet;
public class longest_substring 
{ public static int lengthoflongestsubstring(String s)
	{
		int a_pointer=0;
		int b_pointer=0;
		int max=0;
		
	HashSet<Character> hash_set = new HashSet<Character>();
	while(b_pointer<s.length())
	{
		if(!hash_set.contains(s.charAt(b_pointer)))
		{
			hash_set.add(s.charAt(b_pointer));
			b_pointer++;
			max= Math.max(hash_set.size(), max);
		}
		else
		{
			hash_set.remove(s.charAt(a_pointer));
			a_pointer++;			
		}
	}
	return max;
	}
	public static void main(String[] args) {
    String str = "abcabcbb";
    System.out.println("Length of the longest substring without repeating characters: " + lengthoflongestsubstring(str));
}
}