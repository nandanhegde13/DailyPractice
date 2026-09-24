
public class StringReversal {

	public static void main(String args[])
	{
		String name="Nandan Hegde";
	
		String reversedString="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reversedString+=name.charAt(i);
		}
		System.out.println(reversedString);
	}
}
