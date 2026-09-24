import java.util.ArrayList;

public class CapitalizeArrayElements {

	public static void main(String args[])
	{
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String>arr1= new ArrayList<String>();
		arr.add("Apple");
		arr.add("Ban");
		arr.add("Ora");
		arr.add("Grape");
		arr.forEach(item->{if(item.length()==3)arr1.add(item.toUpperCase());});
        
		arr1.forEach(item->System.out.println(item));

		//Test
		
	}
}
