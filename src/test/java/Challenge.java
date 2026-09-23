
public class Challenge {

	//find sum of all the numbers divisible by both 3 and 5 between m and n inclusive
	
	public static void main(String args[])
	{
		int m=12;
		int n=50;
		int sum=0;
		for(int i=m ;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}
}
