package vectorAndStacks;
import LinkedList.MyLInk;

public class MyStack<E> {

	public MyLInk<E> ll = new MyLInk<E>();
	
	void push(E e) {
		ll.add(e);
	}

	E pop() throws Exception{
		if (ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed ");
		}
		return(ll.removeLast());
	}
	
	E peek() throws Exception{
		if (ll.isEmpty()) {
			throw new Exception("Peeking from empty stack is not allowed ");
		}
		return (ll.getLast());
	}
	
}
