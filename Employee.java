import java.util.TreeSet;
import java.util.Comparator;
public class Employee{
	int eid;
	String ename;
	public Employee(int eid,String ename){
		this.eid = eid;
		this.ename= ename;	
	}
	public String toString(){
		return eid+" "+ename;
	}	
	public static void main(String[] args){
		TreeSet<Employee> t = new TreeSet<>(new Mycomparator());
		t.add(new Employee(104,"Latha"));
		t.add(new Employee(108,"lord"));
		t.add(new Employee(103,"vyshu"));
		t.add(new Employee(101,"Rama"));
		t.add(new Employee(109,"krishna"));
		t.add(new Employee(102,"komali"));
		System.out.println(t);
		t.headSet(103);
	}
}
class Mycomparator implements Comparator{
	public int compare(Object o1,Object o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		Integer I1 =e1.eid;
		Integer I2 = e2.eid;
		if(I1<I2){
			return -1;
		}
		else if(I1>I2){
			return 1;
			
		}
		else{
			return 0;
		}
			
	}
}
