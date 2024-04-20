package comjavatraining.basic;


public class ThisEx2 {
	public ThisEx2() {//6
		System.out.println("default parameter");//7
	}

	public ThisEx2(int a) {
		this();//5
		System.out.println("single parameter constructor");//8

	}

	public ThisEx2(int a, String b) {//2
		this(2);//3
		System.out.println("double parameter constructor");//9
	}

	public static void main(String[] args) {
		ThisEx2 b=new ThisEx2(56, "koushik");//1//10

	} 
}
