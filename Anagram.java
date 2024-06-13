package Arrays;

import java.util.Arrays;

public class Anagram {
	//anagram of cat -> tca, atc
	//check if given two strings are anagram or not (aabc, cbaa)
	//group a list of anagrams = ['cat', 'tca', 'act', 'abbc', 'bbca']
	//length of both string must be same
	//count of each character must be same
	public static void main(String[] args)
	{
		String s1="dog";
		String s2="act";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		if(c1.length != c2.length)
		{
			System.out.println("Strings are not anagram of each other.");
			System.exit(0);
		}
		else
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			for(int i=0; i<c1.length; i++)
			{
				if(c1[i] != c2[i])
				{
					System.out.println("Strings are not anagram of each other.");
					System.exit(0);
				}
				
			}
				System.out.println("Strings are anagram of each other");
		}
	}
}
