import java.util.*;
public class Hashing2 {

	public static void main(String args[])
	{
		HashMap<String,Integer> map = new HashMap<>();
		map.put("India", 140);
		map.put("US",120);
		map.put("China", 130);
		
		System.out.println(map);
	
		map.put("India",150);
		
		System.out.println(map);
		
		System.out.println(map.get("China"));
		
		System.out.println(map.containsKey("India"));
		
		System.out.println(map.containsValue(130));
		
		System.out.println(map.size());

		System.out.println(map.replace("India", 150, 70));
		
		for(Map.Entry<String,Integer> m : map.entrySet())
		{
			System.out.println(m.getKey()+"--->"+m.getValue());
			
		}
	}
	
}
