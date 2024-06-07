package ACME;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("=====================");
		System.out.println("First "+Acme.b);
		Acme a=new Acme();
		a.setB(20);
		System.out.println(a);
		System.out.println("Last "+Acme.b);
	}

}
