package Queue;



public class MainClass {

	public static void main(String[] args) {
		MyQueue<Integer> q = new MyQueue<>();
		
		q.enqueue(12);
		q.enqueue(162);
		q.enqueue(127);
		q.enqueue(312);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.enqueue(456);
		System.out.println(q.dequeue());
	}

}
