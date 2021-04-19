package Encapsulation;

public class Student {

	private int age;
	private String name;
	public int getAge()    //getter to access private variable age
	{
		return age;
	}
	public void setAge(int age) //setter to access private variable age
	{
		if(age>20)
		{
			System.out.print("You are too old to study in our school");
		}
		else
		{
			this.age = age;
		}
	}
	

}
