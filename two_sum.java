package Arrays;
import java.util.Arrays;
import java.util.HashMap;
public class two_sum {
	  //array of int[]={1,2,6,8},target -> 14
	  //two approach -> brute force 
	  //nested loop -> time complexity O(n^2)
	  //best approach?
	  //given condition -> array, target value
	  public static int[] twosum(int[]numbers, int target)
	  {
	    HashMap<Integer,Integer> map = new HashMap<>();
	    for (int i=0; i<numbers.length;i++)
	    {
	        int negation = target - numbers[i];
	        if(map.containsKey(negation))
	        {
	          System.out.println(map.get(negation));
	        return new int[]{numbers[map.get(negation)],numbers[i]};
	        
	        }
	        map.put(numbers[i],i);
	    }
	    return null;
	  }
	public static void main(String[] args)
	    {
	        int numbers[]={1,3,6,8};
	        int n = 14;
	        int result[]= twosum(numbers, n);
	       if(result!=null)
	       {
	        
	        System.out.println("The numbers are"+Arrays.toString(result));
	       }
	       else
	       System.out.println("The values are not provided");

	    }

}
