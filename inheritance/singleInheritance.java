package inheritance;

class singleInheritance {
	
	public void method1() {
		System.out.println("This is base cls method");
		System.out.println("Dog is barking");
	}
}

class child extends singleInheritance {
    public void method2() {
		System.out.println("This is child cls method");
	}
}

class test {
	public static void main(String[] args) {
		child obj = new child();
		obj.method1();
		obj.method2();
	}
}
