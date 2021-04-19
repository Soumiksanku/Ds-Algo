package methods;

public class Introduction {

	public static void main(String[] args) {
		int maximum = maxOf(10,9);
		sayHi();
		System.out.println(maximum);
		

	}
	static int maxOf(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	static void sayHi()
	{
		System.out.println("Hi");
		System.out.println("Good Morning");
	}

}
