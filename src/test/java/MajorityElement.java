import java.util.*;
import java.util.Map.Entry;
public class MajorityElement {

	
	public static void main(String args[])
	{
		int arr[] = {1,3,2,5,1,3,1,5,1};
		int count = arr.length/3;
		HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
         
		for(int num : arr)
		{
			if(!map1.containsKey(num))
			{
				map1.put(num, 1);
			}
			else {
				map1.put(num, map1.get(num)+1);
			}
		}
		
		for(Map.Entry<Integer,Integer> m : map1.entrySet())
		{
			if(m.getValue()>count)
			{
				System.out.println(m.getKey()+"--->"+m.getValue());
			}
		}
		
		//System.out.println(map);
	}
}
