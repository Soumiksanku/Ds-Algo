package exceptionHandling;

public class Exception {

	public static void main(String[] args) {
		/*try
		{
			int a= 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage() +" occured, please check your code");
		}
		System.out.println("Very important code");
		System.out.println("Needs to run");*/
		fun1();
	}
	static void fun1()
	{
		int a= 10;
		int b =3 ;
		int c = a/b;
		System.out.println(c);
		try {
			fun2();
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage()+" ");
		}
	}
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if (isDanger)
			{
			throw new ArrayIndexOutOfBoundsException("Danger was coming");
			}
	}

}
