package utility;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void mergeSort(int a[],int start, int end) {
		if(start < end)
		{int temp = (start+end)/2;
			mergeSort( a,  start, temp);
			mergeSort(a,temp+1, end);
		}
	}

}
