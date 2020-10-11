package ListCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.hashMap;

public class HashMapCollection {

	public static void main(String[] args) {
		// HashMap is a class which implements map interface
		//extends AbstractMap
		//it contains only unique elements
		//stores key-value pair
		//it contains one null key and multiple null values
		//it maintains no order it does not store values in form of index
		
		HashMap<String,String> objMap=new HashMap<String,String>();
		objMap.put("name", "suzuki");
		objMap.put("power", "220");
		objMap.put("Price", "50000");
		
		//elements of map
		System.out.println(objMap);
		
		//remove value from hashmap based on key
		objMap.remove("name");
		System.out.println(objMap);
		
		objMap.containsKey("name");
		System.out.println(objMap);
		
		
		
	}
	
	
}