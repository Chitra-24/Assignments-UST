package chitra;
import java.util.Scanner;
import java.io.*;
import java.util.LinkedList;
//Question 1 to create Array,Linked List,Doubly Linked List,circular Linked List.

class node1 { 
	node1 prev; 
	int data; 
	node1 next;  
	node1(int value) 
	{ 
		prev = null; 
		data = value; 
		next = null; 
	} 
} 

//circular Linked List
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class JavaCollections {
	//Array
	void ArrayExample() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
	    int[] array = new int[size];
	    System.out.println("enter the values");
	    for(int i=0;i<size;i++) {
	    	array[i]=sc.nextInt();
	    }
	        System.out.println(array);
	}
//LinkedList
	public void LinkedListExample() {
	        LinkedList<Integer> linkedList = new LinkedList();
	        linkedList.add(1);
	        linkedList.add(2);
	        linkedList.add(3);
	        System.out.println(linkedList);
	}

	//Doubly LinkedList
	static node1 head = null; 
	static node1 tail = null; 
	static void insertAtBeginning(int data) 
	{ 
		node1 temp = new node1(data); 
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

		node1 temp = head; 
		head = head.next; 
		head.prev = null; 
		temp.next = null; 
	} 

	static void display(node1 head) 
	{ 
		node1 temp = head; 
		while (temp != null) { 
			System.out.print(temp.data + " --> "); 
			temp = temp.next; 
		} 
		System.out.println("NULL"); 
	} 
	
	//Circular LinkedList
	 Node head1;
	public void addNode(int value) {
        Node newNode = new Node(value);

        if (head1 == null) {
            head1 = newNode;
            newNode.next = head1;
        } else {
            Node lastNode = head1;
            while (lastNode.next != head1) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            newNode.next = head1;
        }
    }
	public void Cdisplay() {
		Node currentNode = head1;
		do {
		    System.out.println("Circular linked list element is " + currentNode.data);
		    currentNode = currentNode.next;
		} while (currentNode != head1);
	}
	public static void main(String[] args) {
		JavaCollections jc=new JavaCollections();
		Scanner scan=new Scanner(System.in);
		int choice;
		do {
		System.out.println("Menu\n 1. Array\n 2. LinkedList\n 3. Doubly LinkedList\n 4. circular LinkedList\n 5. exit");
		System.out.println("enter choice");
		choice=scan.nextInt();
		switch(choice) {
		case 1:System.out.println("you selected Array");
				jc.ArrayExample();
				break;
		case 2:System.out.println("you selected LinkedList");
				jc.LinkedListExample();
				break;
		case 3:System.out.println("you selected Doubly LinkedList");
				jc.insertAtBeginning(1);
				jc.insertAtBeginning(2);
				jc.insertAtBeginning(3);
				jc.display(head);
				break;
		case 4:System.out.println("you selected Circular LinkedList");
				jc.addNode(10);
				jc.addNode(20);
				jc.addNode(30);
				jc.addNode(40);
				jc.addNode(50);
				jc.Cdisplay();
				break;
		case 5:System.out.println("exited");
				break;
		default:System.out.println("invalid");
		}
	}while(choice!=5);
}
}
