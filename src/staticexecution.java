public class staticexecution {

	static int a = 5;
	
	static {
		System.out.println(a);
		print("Static Block");
	}
	
	int b = 10;
	
	staticexecution() {
		print("Constructor");
	}

	public static void main(String[] args) {
		print("Main Method");
		new staticexecution();
	}

	static void print(String msg) {
		System.out.println(msg);
	}
}
