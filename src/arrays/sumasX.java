package arrays;

import java.util.HashSet;

public class sumasX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[]{1, 4, 45, 6, 10, 8};
		sumasXHashing(a, 16);
	}
	
	public static void sumasXHashing(int a [],int n) {
		
		
		HashSet<Integer> hash = new HashSet<Integer>();
		for(int b : a)
		{
			hash.add(b);
		}
		
		
		
		for(int b : a)
		{
			if(hash.contains(n-b))
			{
				System.out.println(b);
				System.out.println(n-b);
			}
		}
	}
	

}
