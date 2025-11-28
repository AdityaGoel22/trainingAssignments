package trainingd9.d10;

import java.util.Map.Entry;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashMap {
	
	public static void main (String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1,  "BLR");
		hashMap.put(33,  "DEL");
		hashMap.put(44,  "HYD");
		hashMap.put(4,  "BOM");
		
		System.out.println(hashMap);
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		System.out.println(hashMap.entrySet());
		
		System.out.println(hashMap.get(4));
		
		System.out.println(hashMap.getOrDefault(4, "GOA"));
		System.out.println(hashMap.getOrDefault(13, "GOA"));
		System.out.println(hashMap);
		
		Set<Integer> keySet = hashMap.keySet();
		Set<String> valueSet = new HashSet<String> (hashMap.values());
		
		Iterator<Integer> keyitr = keySet.iterator();
		while(keyitr.hasNext()) {
			System.out.println(keyitr.next());
		}
		
		Iterator<String> valueitr = valueSet.iterator();
		while(valueitr.hasNext()) {
			System.out.println(valueitr.next());
		}
		
		
		Iterator<Entry<Integer, String>> entry = hashMap.entrySet().iterator();
		while (entry.hasNext()) {
			System.out.println(entry.next());
		}
		
		
		
	}

}
