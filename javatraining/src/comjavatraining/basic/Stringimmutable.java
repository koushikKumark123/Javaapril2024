package comjavatraining.basic;

public class Stringimmutable {
	public static void main(String[] args) {
		// string literal
		String a1 = "raj";// 1
		String b1 = "raj";// 2

		int s = 13;// garbage

		a1.concat("kumar");// creates a new string object since strings are immutable.
		System.out.println(a1);

		String a = new String("Ankit");
		System.out.println(a);
		String b = new String("Ankit");
		System.out.println(b);
		a.concat("singh");
		System.out.println(a);
		System.gc();// garbage collector
	}

	protected void finalize() {

	}
}
// string once created, they cannot be changed. Any modification to a string
// results in a new object, leaving the original string unaltered.
