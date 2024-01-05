import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
class LinkedListDemo{
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(6);
		
		LinkedList<Integer> l = new LinkedList<>();
		// Methods for adding the elements to a linkedlist
		l.add(40);
		l.add(30);
		l.add(40);
		l.add(56);
		l.add(12);
		//Add the element at the required position
		l.add(3,90);
		
		l.addAll(al);// insert the given collection at last
		
		// if we want to insert given collection at a particular index then
		l.addAll(3,al);
		System.out.println(l);
		//Other methods to add the elements
		l.addFirst(89);
		l.addLast(70);
		l.offer(1237);//inserts at last
		l.offerFirst(123);//insert element at first
		l.offerLast(9439);//insert element at last
		System.out.println(l);
		
		
		//All the methods of remove an element from the linkedlist
		//This takes the object as input
		l.remove(Integer.valueOf(56));
		l.remove(6);
		l.removeFirst();
		l.removeLast();
		//l.clear(); removes all the elements
		System.out.println(l);
		
		//methods for accessing the elemnts of a linked list
		l.get(2); //get the element at the particular index
		l.getFirst();//get the firstlement
		l.getLast();//get the last element 
		
		//checking the list properties
		l.size();
		l.isEmpty();
		System.out.println(l.contains(30));
		System.out.println(l.indexOf(30));
		
		//to retrive/get the elements of a linked list
		System.out.println(l.peek()); //retrives the first element
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());//retrives the last element
		System.out.println(l);
		
		
		//to retrive and remove the elements
		System.out.println(l.poll());//retrives and remove the first element of a list
		System.out.println((l.pollFirst()));
		System.out.println((l.pollLast()));
		
		System.out.println(l);
		
		//descending iterator  to obtain the elements of a linked list
		Iterator<Integer> i = l.descendingIterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
	}
}