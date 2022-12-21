package conditional;

public class Test1 {
	private void add() {
		System.out.println("This is add method");
	}

	private void sub() {
		System.out.println("This is sub method");
	}

	public static void main(String[] args) {
		Test1 a = new Test1();
		a.add();
		a.sub();
	}

}
