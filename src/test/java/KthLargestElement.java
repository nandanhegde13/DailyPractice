import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class KthLargestElement {

	public static void main(String args[])
	{
		
		int arr[] = {5,5,6,3,6,7,2,4,0};  
		int k = 3;
		
		System.out.println(withDuplicate(arr,k));
		System.out.println(withoutDuplicate(arr,k));
	}
	
	private static int withDuplicate(int[] arr, int k)
	{
		int kthLargest=Integer.MIN_VALUE;
		Arrays.sort(arr);
		kthLargest = arr[arr.length-k];
		return kthLargest;
	}
	
	
	private static int withoutDuplicate(int[] arr, int k)
	{
		int kthLargest=Integer.MIN_VALUE;
		
		TreeSet<Integer> treeset = new TreeSet<>();
		for(int num :arr)
		{
			treeset.add(num);
		}
		
		ArrayList<Integer> arrList = new ArrayList<> (treeset.descendingSet());
		kthLargest=arrList.get(k-1);
		
		return kthLargest;
	}
	
}
