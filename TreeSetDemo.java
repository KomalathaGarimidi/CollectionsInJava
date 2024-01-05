import java.util.TreeSet; 
import java.util.Comparator;

public class TreeSetDemo implements Comparator{
	//Comparable is present in java.lang package and it contains
	//only one method compareTo()
	public int compare(Object o1,Object o2){
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		if(I1<I2){
			return 1;
		}
		else if(I1>I2){
			return -1;
		}
		else{
			return 0;
		}
		
	}
	public static void main(String[] args){
		//TreeSet<Integer> t = new TreeSet<>(new TreeSetDemo());
		// This is for customised sorting order
		TreeSet<Integer> t = new TreeSet<>();
		t.add(98);
		t.add(12);
		t.add(45);
		//t.add('A'); getting ClassCastException
		//Hetorogenous elements are not possible to insert 
		t.add(32);
		t.add(36);
		t.add(33);
		t.add(31);
		System.out.println(t);
		System.out.println(t.add(98));
		System.out.println(t.add(79));
		System.out.println(t);
		System.out.println("headset of a tree is "+t.headSet(32));
		System.out.println("tailSet of tree is "+t.tailSet(32));
		System.out.println("first element of treeset "+t.first());
		System.out.println("last element of a treeset "+t.last());
		System.out.println("higher element of a treeset "+t.higher(32));
		System.out.println("lower element of a treeset "+t.lower(32));
		System.out.println("ceiling element "+t.ceiling(29));
		System.out.println("floor element "+t.floor(29));
		System.out.println("polllast " +t.pollLast());
		System.out.println("pollfirst "+t.pollFirst());
		//t.add(null);
		//upto 1.6v null is added as a first element to the empty treeset.
		//but from 1.7 null not allowed even as a first element also
		System.out.println(t);
		//getting NullPointerException.null insertion is not possible;
		
		TreeSet<StringBuffer> t1 = new TreeSet<>();
		t1.add(new StringBuffer("A"));
		t1.add(new StringBuffer("R"));
		t1.add(new StringBuffer("a"));
		t1.add(new StringBuffer("V"));
		
		System.out.println(t1);
		
	}
}