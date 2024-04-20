package comjavatraining.basic;

public class Returntype {
	public void run() {
		System.out.println("it will not return anything");
	}

	public void run1() {
	}

	public boolean run2() {
		return false;
	}

	public String run3() {
		return "Hello world";
	}

	public int run4(int a, int b) {
		return a+b;

	}
	public static void main(String[] args) {
		Returntype r = new Returntype();
		r.run();
		r.run4(2,4);
		System.out.println(r.run4(2,4));
		System.out.println(r.run3());
		System.out.println(r.run2());
		
		
	}
}


