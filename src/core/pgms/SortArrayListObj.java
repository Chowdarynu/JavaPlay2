package core.pgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListObj {
	public static void main(String args[]) {
		List l = new ArrayList();
		l.add(new Employee(20, "javainterviewpoint"));
		l.add(new Employee(10, "javainterview"));
		l.add(new Employee(30, "jip"));

		Collections.sort(l);
		System.out.println(l);
	}
}

class Employee implements Comparable {
	private String empname;
	private int eid;

	public Employee(int eid, String empname) {
		this.eid = eid;
		this.empname = empname;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	@Override
	public int compareTo(Object o1) {
		// if this.eid is greater than e1's eid then it returns a positive
		// interger
		// if this.eid is lesser than e1's eid then it returns a negative
		// interger
		// if this.eid is equal than e1's eid then it returns zero
		Employee e1 = (Employee) o1;
		return (this.getEid() - e1.getEid());
	}

	public String toString() {
		return " \n id : " + this.eid + " empname : " + this.empname;
	}
}