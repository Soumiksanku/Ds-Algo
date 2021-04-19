package LinkedList;

public class LinkedList {
	
	Node head;  //Head of the node
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}//Node created
	
	//inserting at the start
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head  = new_node;
	}
	
	//Adding a node after a given node
	public void AddAfter(Node prev_node , int x) {
		if(prev_node == null) {
			System.out.println("It cannot be null");
			return;
		}
		Node new_node = new Node(x);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	
	
	//Adding a node at the last
	public void append(int p) {
		Node new_node = new Node(p);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next!=null) {
			last = last.next;
			last.next = new_node;
			return;
		}
	}
	
	//deleting a particular node with a given data
	public void delete_node(int key) {
		Node temp = head,prev = null;

		
		//if head is the node to be deleted
		if(temp!=null && temp.data == key) {
			head = temp.next;
			return;
		}
		while(temp.next!=null && temp.data!=key) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null)
			return;
		prev.next = temp.next;
	}
	
	
	//deleting a particular node at a given position
	public void deleteNodePosition(int position) {
		if(head == null)
			return;
		Node temp = head;
		if (position == 0) {
			head = temp.next;
			return;
		}
		
		//finding the previous node of the node to be deleted
		for(int i =0; temp!= null && i<position-1; i++) {
			temp = temp.next;
			return;
		}
		
		//if position is more than number of nodes
		
		if(temp == null || temp.next == null) {
			return;
		}
		Node next = temp.next;
		temp.next = next;
	}
	
	//program to calculate length of a linked list
	
	public int getCount() {
		Node temp = head;
		int count = 0;
		if (temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	//program to find an element in a linked list
	
	public boolean search(Node head, int x) {
		Node current = head;
		while(current!=null) {
			if(current.data == x)
				return true;
			current = current.next;
			}
		return false;
	}
	
	//printing a linked list
	public void printList() {
		Node tnode = head;
		while(tnode!=null) {
			System.out.println(tnode.data+" ");
			tnode = tnode.next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Start with empty list */
        LinkedList llist = new LinkedList();
 
        /* Use push() to construct below list
           1->12->1->4->1  */
        llist.push(1);
        llist.push(4);
        llist.push(1);
        llist.push(12);
        llist.push(1);
        llist.AddAfter(llist.head.next, 8);
        llist.printList();
        int res= llist.getCount();
        System.out.println(res);
	}

}
