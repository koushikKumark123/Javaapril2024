package comjavatraining.basic;

public class ThisEx {
//this keyword which is used to access the instance variable and instance method
	// it can be used inside a method or constructor.
	// this() not a keyword which is used to invoke or call overloaded constructor
	// of same class
	String name;// global variable//john
	int age;// global variable//26

	public ThisEx(String name, int age) {// local variable
		this.name = name;//john
		this.age = age;//26
	}

	void dispalay() {
		System.out.println("name:" + name + " age :" + age);
	}

	public static void main(String[] args) {
		ThisEx n = new ThisEx("john", 26);
		n.dispalay();
	}
}
