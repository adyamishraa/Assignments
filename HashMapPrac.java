package Collec;
import java.util.*; 

public class HashMapPrac { 
	public static void main(String[] args) 
	{ 

		HashMap<Integer, String> map = new HashMap<>(); 
		map.put(1,"a"); 
		map.put(2,"b"); 
		map.put(3,"c"); 

		System.out.println("Size of map is:- "
						+ map.size()); 

		System.out.print("Map: ");
		print(map);
		if (map.containsKey(1)) { 
			System.out.print("Searching for key=1 : ");
			System.out.println("Key found");
			String s = map.get(1); 
			System.out.println("value for key 1 is: "+ s); 
		} 
		map.clear();
		System.out.println("Deleting every entry on the map!");
		print(map);
		} 

	public static void print(Map<Integer, String> map) 
	{ 
		if (map.size()==0) { 
			System.out.println("map is empty"); 
		} 

		else { 
			System.out.println(map); 
		} 
	} 
} 
