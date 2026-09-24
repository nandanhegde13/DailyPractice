
public class LastRepeatingCharacter {

	public static void main(String args[])
	{
		String name = "nanda";
		char repeatingChar=' ';
		
		for(int i=name.length()-1;i>=0;i--)
		{
			boolean repeating = false;
			
			char ch = name.charAt(i);
			
			for(int j=0;j<name.length();j++)
			{
				if(j!=i && ch==name.charAt(j))
				{
					repeating =true;
					break;
				}
			}
				
				if(repeating==true)
				{
					repeatingChar=ch;
					break;
				}		
			
			
		}
		
		if(repeatingChar!=' ')
		{
			System.out.println(repeatingChar);
		}
		
		
	}
	
}
