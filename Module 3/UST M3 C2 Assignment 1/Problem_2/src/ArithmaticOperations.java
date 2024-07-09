import java.util.Scanner;
public class ArithmaticOperations {
	static int Addition(int a,int b) {
		return a+b;
	}
	static int Subtraction(int a,int b) {
		return a-b;
	}
	static int Multiplication(int a,int b) {
		return a*b;
	}
	static int Division(int a,int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		ArithmaticOperations ao=new ArithmaticOperations();
		float res;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Menu\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division");
		System.out.print("Enter the operation you want to perform\n");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: res=ao.Addition(x, y);
				System.out.println("Addition of numbers is "+ res);
				break;
		case 2: res=ao.Subtraction(x, y);
				System.out.println("Subtraction of numbers is "+ res);
				break;
		case 3: res=ao.Multiplication(x, y);
				System.out.println("Multiplication of numbers is "+ res);
				break;
		case 4: res=ao.Division(x, y);
				System.out.println("Division of numbers is "+ res);
				break;
		default: System.out.println("Invalid choice!");
		}
		sc.close();
	}

}
