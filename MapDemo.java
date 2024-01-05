import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class MapDemo{
//	public static void m1()throws Exception{
		//Thread.sleep(1000);
	//}
	public static void main(String[] args){
		//MapDemo.m1();
		//inserted based hashcode of keys
		//putAll() is used to put entire collection to the map
		Map<Integer,String> m = new HashMap<>();
		m.put(101,"latha");
		m.put(104,"vyshu");
		m.put(106,"Komali");
		m.put(102,"rama");
		m.put(111,"uyt");
		m.put(105,"uytjhg");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get(111));
		System.out.println(m.remove(111));
		/*collection views of map
		Set keySet()
		Collection values()
		Set entrySet()
		EntrySet methods are 
		1.Object getKey()
		2.Object getValue()
		Object setValue(Object new )*/
		Set s  = m.entrySet(); 
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
		
		
	}
}

/*Difference between Hashmap and Hashtable
HashMap:
1.Every method present in hashmap is not synchronised
2.At a time multiple threads are allowed to operte on hashmap andIt is not thred safe
3.Relativey performance is High because threads are not required to wait
4.null is allowed for both key and values
5.Introduced in 1.2 version and it is not legacy

Hashtable.
1.Every method in hashtable is synchronised
2.only one thread is allowed to operate on hash table and hence it is thread safe
3.reltivey performance is low because threads are required to wait to operate on hashtable object
4.null is not allowed for keys and values otherwise we will get NullPointerException
5.Introduced in 1.0v and it is legacy*/
 