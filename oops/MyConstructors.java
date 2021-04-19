package oops;


class vehicle
{
	int wheels;
	String color;
	
	vehicle()    //default constructor
	{
		//this.wheels = wheels;
	}
	
	vehicle(int wheels)
	{
		this.wheels = wheels;
	}
	vehicle( int wheels, String colour)  //same constructor with different parameters
	{
		this.wheels = wheels;
		color = colour;
	}
}

public class MyConstructors {
	
	MyConstructors()
	{
		System.out.println("Object is now creted");
	}
	
	public static void main(String[] args) {
		MyConstructors obj = new MyConstructors();     //Constructor is called
		vehicle car = new vehicle(4,"Red");    //whenever this car object of vehicle class is created the wheels  get initialized to 4 because within the class we had already defined wheels=4
		vehicle scooty = new vehicle(2,"Blue");
		vehicle random = new vehicle();   // default constructor is called here
		System.out.println(car.wheels+" "+car.color);
		System.out.println(scooty.wheels+" " +scooty.color);
	}

}
