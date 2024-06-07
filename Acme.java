package ACME;

public class Acme {
	
	public String name;
	int a= 1;
	static int b=10;
	
	{
		System.out.println(" Block inst");
	}

	static {
		System.out.println(" Block Static");
	}
	
	int m1(){
		return 1;
	}
	
	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		Acme.b = b;
		System.out.println(" static Acme.b "+Acme.b);

	}

	static int m2(){
		return 2;
	}
	
	Acme(){
		System.out.println(" Cons ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Acme [name=" + name + ", a=" + a +"b "+ b +"]";
	}
	
	
	
}
