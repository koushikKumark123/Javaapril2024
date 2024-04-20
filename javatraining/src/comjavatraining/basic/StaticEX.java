package comjavatraining.basic;

public class StaticEX {
	public static void run() {
		System.out.println("samsung");
	}

	public void run1() {
		System.out.println("i phone");
	}

	public static void main(String[] args) {
		run();
		StaticEX n = new StaticEX();
		n.run1();
	}
}
