package com.Deepak;
import java.util.*;

class custom_comparator implements Comparator<employee> {
	public int compare(employee s1, employee s2) {
		return s1.rollno - s2.rollno;
	}
}


class employee {
	int rollno;
	String name;
	employee(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}

public class implComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hii this is Implementation of comparators");
		employee arr[] = new employee[5];
		arr[0] = new employee(10, "deepak");
		arr[1] = new employee(6, "nikita");
		arr[2] = new employee(22, "rambabu");
		arr[3] = new employee(4, "pagal");
		arr[4] = new employee(12, "shyam");
		
		Arrays.sort(arr, new custom_comparator()); 
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].rollno+" "+arr[i].name);
		}
	}
}
