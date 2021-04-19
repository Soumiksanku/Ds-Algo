package oops;

public class A {

	class B {
		// object of A needs to be created before creating the object of B
	}
	static class C {
		// object of A need not be created before creating the object of C which is the speciality of static keyword
	}

}
