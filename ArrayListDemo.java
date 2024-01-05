//All the methods of the arrayList

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> l = new LinkedList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		
		l.add(10);
		l.add(15);
		l.add(38);
		l.add(67);
		l.add(78);
		l.add(98);
		
		
		ll.add(876);
		ll.add(77);
		ll.add(98);
		
		
		//All the add methods of arrayList class
		al.addAll(l); // Adds all the elements of a particular collection to arraylist
		al.add(1,78); // add element at particular index
		al.add(1);// adds element at last
		al.addAll(4,ll);//Adds the given collection at a particular index
		
		Collections.sort(al);
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//All the remove() of ArrayList class
		al.remove(3);//This method is used to remove the  element at a particular index
		al.remove(Integer.valueOf(98));
		//This method is used to remove the objects of a collections
		//67 is a integer value it is a primitive datatype
		//collections does not support primitives supports only objects
		//so by using Integer.valueOf() that primitive value was converted into object type
		//al.removeAll(ll);
		//this method removes entire collection from list
		//al.clear();//this method is also used to remove all the elements from the list
		al.isEmpty();//used to check whethe the collection is empty or not
		al.contains(876);
		al.size();
		System.out.println(al.indexOf(79));//returns -1 if the given element is not present
		// in arraylist
		al.set(0,90);
		
		
		//return the last occurence of a given element
		System.out.println(al.lastIndexOf(78));
		
		al.toArray();//used to convert the list into arrayList
		
		System.out.println(al.subList(1,4));
		
	//	al.sort();
	
	
	//   removes all the elements and return the elemnts 
	//present in the collection which send s an argument
		System.out.println(al.retainAll(ll));
		
		al.removeIf(i->i%2==0);
		//remove all the even elemnts returns the remaining elemnts
		
		al.replaceAll(i->i*i);
		// replace the elements according to the given expression
		
		System.out.println(al);
		
		
		//only for linked list  class
		/*Iterator<Integer> i = al.descendingIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}*/
		
	}

}