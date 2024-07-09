import java.util.LinkedList;
public class linkedListExample {

	public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("apple");
        myLinkedList.add("banana");
        myLinkedList.add("orange");
        myLinkedList.add("pear");

        System.out.println("My LinkedList before appending: " + myLinkedList);

        myLinkedList.add("grape");
        System.out.println("My LinkedList after appending: " + myLinkedList);

	}

}
