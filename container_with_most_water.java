package Arrays;

public class container_with_most_water {
	//given -> height of container {1,5,6,3,4,2}
	//problem: containers are give, combination of which two containers can occupy most water 
	//brute force : compare each containers
	//optimal solution:
	public static int maxArea(int[] height) {
		int max=0;
		int l=0;
		int r=height.length-1;
		while(l<r)
		{
			int lv = height[l];
			int rv = height[r];
			int min = Math.min(lv, rv);
			int len = r-1;
			int area = min * len;
			max = Math.max(max, area);
			if(lv<rv)
				l++;
			else r--;

		}
		return max;
	}
	public static void main(String[] args)
	{
		int h[]= {1,5,6,3,4,2};
		System.out.println("Maximum amount of water contained is:"+maxArea(h));
		}
}
