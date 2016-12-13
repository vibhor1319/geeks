package arrays;

public class numberOccuringOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		int a = numberOccuringOld(ar);
		System.out.println(a);
		
		
		
	}
	
	 public static int numberOccuringOld(int ar[])
	 {
		 int number = 0;
		 for (int i : ar) {
			number  = number^i;
		}
		 System.out.println(number);
		 return number;
	 }

}
