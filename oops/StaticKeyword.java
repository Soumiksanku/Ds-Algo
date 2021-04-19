package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {

	public static void main(String[] args) {
		A objA  = new A();
		B objB = objA.new B(); // non static class so object of its parent class is required
		C objC = new A.C();   //static class so object creation of its parent class is not required 
				
	}

}
