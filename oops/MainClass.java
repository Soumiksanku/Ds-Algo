package oops;


class cat
{
	boolean hasFur;
	String color,breed;
	int legs , eyes;
	
	public void walk()
	{
		System.out.println("Cat is walking");
	}
	public void eat()
	{
		System.out.println("Cat is eating");
	}
	public void description()
	{
		System.out.println("my cat has "+legs+" legs and "+eyes+" eyes");
	}
}
class dog
{
	String breed ,name;
	public void jump()
	{
		System.out.println("my dog "+name+" jumped");
	}
	public void description()
	{
		System.out.println("my dog's name is "+name+" and its breed is "+breed);
	}
}

public class MainClass {

	public static void main(String[] args) {
		
		 	/*cat cat1 = new cat();
		    cat cat2 = new cat();
		    cat1.legs=4;
		    cat1.eyes=2;
		    cat2.legs=2;
		    cat2.eyes=2;
		    cat1.description();
		    cat2.description();*/
			
			dog husky  = new dog();
			dog poodle = new dog();
			
			husky.breed = "Husky";
			husky.name = "Brownie";
			poodle.breed = "Poodle";
			poodle.name = "Rony";
			husky.jump();
			husky.description();
			poodle.jump();
			poodle.description();
	}

}
