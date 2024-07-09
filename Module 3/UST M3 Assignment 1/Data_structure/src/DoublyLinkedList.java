import java.io.*; 

	class node { 
		node prev; 
		int data; 
		node next;  
		node(int value) 
		{ 
			prev = null; 
			data = value; 
			next = null; 
		} 
	} 

	public class DoublyLinkedList { 
		static node head = null; 
		static node tail = null; 
		static void insertAtBeginning(int data) 
		{ 
			node temp = new node(data); 
			if (head == null) { 
				head = temp; 
				tail = temp; 
			} 
			else { 
				temp.next = head; 
				head.prev = temp; 
				head = temp; 
			} 
		} 

		static void insertAtEnd(int data) 
		{ 
			node temp = new node(data); 
			if (tail == null) { 
				head = temp; 
				tail = temp; 
			} 
			else { 
				tail.next = temp; 
				temp.prev = tail; 
				tail = temp; 
			} 
		} 

		static void deleteAtBeginning() 
		{ 
			if (head == null) { 
				return; 
			} 

			if (head == tail) { 
				head = null; 
				tail = null; 
				return; 
			} 

			node temp = head; 
			head = head.next; 
			head.prev = null; 
			temp.next = null; 
		} 

		static void deleteAtEnd() 
		{ 
			if (tail == null) { 
				return; 
			} 

			if (head == tail) { 
				head = null; 
				tail = null; 
				return; 
			} 

			node temp = tail; 
			tail = tail.prev; 
			tail.next = null; 
			temp.prev = null; 
		} 

		static void display(node head) 
		{ 
			node temp = head; 
			while (temp != null) { 
				System.out.print(temp.data + " --> "); 
				temp = temp.next; 
			} 
			System.out.println("NULL"); 
		} 
		public static void main(String[] args) 
		{ 
			insertAtEnd(1); 
			insertAtEnd(2); 
			insertAtEnd(3); 
			insertAtEnd(4); 
			insertAtEnd(5); 

			System.out.print("After insertion at tail: "); 
			display(head); 

			System.out.print("After insertion at head: "); 
			insertAtBeginning(0); 
			display(head);  

			deleteAtBeginning(); 
			System.out.print("After deletion at the beginning: "); 
			display(head); 

			deleteAtEnd(); 
			System.out.print("After deletion at the end: "); 
			display(head); 

		} 
	}


