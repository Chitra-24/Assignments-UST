import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {

	public static void main(String[] args) {

		    ArrayList<String> sub = new ArrayList();

		    sub.add("Java");
		    sub.add("Python");
		    sub.add("JavaScript");
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter index from 0-2");
		    int i= sc.nextInt();
		    String str=sub.get(i);
		    System.out.println("Element at index 1: "+ str);

	}

}
