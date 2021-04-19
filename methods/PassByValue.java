package methods;

public class PassByValue {

	public static void main(String[] args) {
		/*int c = 35;
		int d = 45;
		swap(c,d);
		System.out.println(c+" "+d);*/
		Dog c = new Dog();
		Dog d  = new Dog();
		c.legs = 12;
		d.legs = 25;
		swap(c,d);
		System.out.println(c.legs+" "+d.legs);
	}
	static void swap(int a ,int b)
	{
		int temp = a;
		a=b;
		b=temp;
	}
	static void swap(Dog a,Dog b)
	{
		Dog temp = a;
		 a= b;
		 b=temp;}

}

class Dog
{
	int legs;
}