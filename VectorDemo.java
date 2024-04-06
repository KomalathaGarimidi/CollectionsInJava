import java.util.ArrayList;
import java.util.Vector;
class VectorDemo{
	public static void main(String[] args){
		ArrayList<Integer> l = new ArrayList<>();
		l.add(3);
		l.add(5);
		l.add(45);
		l.add(67);
		Vector<Integer> v = new Vector<>();
		
		//methods for adding elements
		v.add(32);
		v.add(98);
		v.add(34);
		
		v.add(2,78);//adds the element at given index
		
		v.addAll(l);// add a collection to the vector
		v.addAll(3,l);
		v.addElement(1000);
		
		
		System.out.println(v);
		//methods for removing elements of a vectorclass
		v.remove(6);//removes the element at a particular index
		v.remove(Integer.valueOf(45));
		v.removeAll(l);//removes particular collection
		v.removeElement(78); //removes the particular element
		v.removeElementAt(1);//removes the element at a particular index
		System.out.println(v);
		
		//Accessing elements
		System.out.println(v.get(2)); //returns the element at specified index
		System.out.println(v.elementAt(2));// returns the element at specified index
		System.out.println(v.firstElement());// returns the first element
		System.out.println(v.lastElement());// returns the last element
		
		//checking vector properties
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		//System.out.println(v.contains()); checking whether the given element is present in collection or not 
		//System.out.println(v.index()); returns the index of a particular element
		
		//v.clear()
		// clear(): Removes all elements from the vector.
		// setSize(int newSize): Sets the size of the vector.
		// capacity(): Returns the current capacity of the vector.
		// ensureCapacity(int minCapacity): Increases the capacity of the vector, if necessary.
		// trimToSize(): Trims the capacity of the vector to its current size.

	}
}
