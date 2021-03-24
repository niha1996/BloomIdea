package marks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
public static void main(String[] args)
{
	HashMap hm=new HashMap();
	hm.put(1,"Meet");
	hm.put(2,"Nihal");
	hm.put(3,"Jigar");
	hm.put(4,"Poojan");
	System.out.println(hm);
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	System.out.println(hm.entrySet());
	Set set =hm.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext())
	{
		Map.Entry map=(Entry) itr.next();
		System.out.println("key : "+map.getKey());
		System.out.println("Value :" +map.getValue());
		
	}
}
}
//List,HashSet,HashMap