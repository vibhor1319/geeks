package arrays;

import java.security.KeyStore.Entry;
import java.util.HashMap;

public class majorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[]{1, 3, 3,3, 1, 2,3,2,2};
		//majorityElementHashing(a);
        int candidate =majorityElementMooreMajority(a);
        int count = 0;
        for(int m:a)
        {
        	if(m==candidate)
        	{
        		count++;
        	}
        }
        
        
        if(count > (a.length/2))
        {
        	System.out.println(candidate);
        }
        
	}
	
	public static int majorityElementHashing(int a[])
	{
		
		HashMap<Integer, Integer> a1 = new HashMap<Integer, Integer>();
		for (int i : a) {
			if(a1.containsKey(i))
			{
				a1.put(i, a1.get(i)+1);
			}
			else
			{
				a1.put(i, 1);
			}
		}
		
		for (HashMap.Entry<Integer, Integer> entry : a1.entrySet()) {
			if(entry.getValue() > (a.length/2))
			{
				System.out.println(entry.getKey());
			}
		}
		return 0;
	}
	// poc  https://www.quora.com/What-is-the-proof-of-correctness-of-Moores-voting-algorithm
	public static int majorityElementMooreMajority(int a[])
	{
		int candidate = Integer.MIN_VALUE, count = 0; 
		for(int i : a)
		{
			if(i!=candidate)
			{
				if(count == 0)
				{
					candidate = i;
				}
				else
				{
					count--;
					if(count == 0)
					{
						candidate = i;
						
					}
				}
			}
			else
			{
				count++;
			}
		}
		
		System.out.println(candidate);
		System.out.println(count);
		return candidate;
	}

}
