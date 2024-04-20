package comjavatraining.basic;

public class Child extends Parent {

	public void money() {
		System.out.println("2lakhs");
	}

	public static void main(String[] args) {
		Child a = new Child();
		a.house();
		a.land();
		a.money();
		a.gold();
	}
}
