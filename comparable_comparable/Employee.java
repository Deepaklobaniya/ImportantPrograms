package comparable_comparable;
import java.util.*;
//public class Student implements Comparable<Student> {
//	
//	int marks;
//	String name;
//	
//	public Student(int marks, String name) {
//		super();
//		this.marks = marks;
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [marks=" + marks + ", name=" + name + "]";
//	}
//
//	public int getMarks() {
//		return marks;
//	}
//
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		if(this.marks < o.marks)
//			return -1;
//		else if(this.marks > o.marks) 
//			return 1;
//		return this.name.compareTo(o.name);
//	}
//	
//}

	public class Employee implements Comparable<Employee> {

		int id;
		String name;
		
		
		public Employee(int id, String name) {
			super();
			this.id  = id;
			this.name = name;
		}

		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.id < o.id) 
			return -1;
		else if(this.id > o.id) 
			return 1;
		return id;
	}
		
	}
