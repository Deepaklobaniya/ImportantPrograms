package comparable_comparable;
import java.util.*;
public class MainClass {
	
	public static void main(String[] args) {
//		List<Student> students = new ArrayList<>();
//		students.add(new Student(23, "Ayush"));
//		students.add(new Student(2, "Deepak"));
//		students.add(new Student(2, "peepak"));
//		students.add(new Student(25, "Deepak"));
//		students.add(new Student(26, "Deepak"));
//		students.add(new Student(24, "Deepak"));
//		
////		Collections.sort(student,(o1,o2) -> {
////				if(o1.name.equals(o2.name)) 
////					return o1.marks-o2.marks;
////				else {
////					return o1.name.compareTo(o2.name);
////				}
////			});
//		
//		Collections.sort(students, Comparator.comparing(Student::getName));
//		
//		students.forEach(System.out::println);
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Deepak"));
		employees.add(new Employee(2, "Ayush"));
		employees.add(new Employee(1, "Nikita"));
		employees.add(new Employee(0, "Harsh"));
		Collections.sort(employees);
		employees.forEach(emp -> System.out.println(emp));
	}
}
