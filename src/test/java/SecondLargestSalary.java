public class SecondLargestSalary {

	public static void main(String args[])
	{
	int[] arr = new int [] {10,20,43,32,26,78};
	int largest=Integer.MIN_VALUE;
	int secondLargest = Integer.MIN_VALUE;
	
	
	
	for(int i=0;i<arr.length;i++)
	{
	   
	 if (arr[i]>largest) {
		 secondLargest=largest;
		 largest  = arr[i];
		 
	 }
	 
	 else if(arr[i]>secondLargest && arr[i]!=largest)
	 {
		 secondLargest=arr[i];
	 }
	}
	
	
	}
	
}
