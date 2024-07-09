import java.util.Scanner;
class stack{
	static public int top;
	static public int[] s;
	
 	stack(int c) {
		top=-1;
		int c1=c;
		s=new int[c1];
	}
 	static void Push()
 	{
 		Scanner sc=new Scanner(System.in);
 		if(top==s.length-1) {
 			System.out.println("Stack overflow");
 		}
 		else {
 			System.out.println("enter to push");
 			s[++top]=sc.nextInt();
 			
 		}
 		}
 	static void Pop()
 	{
 		if(top==-1) {
 			System.out.println("Stack underflow");
 		}
 		else {
 			System.out.println("you popped " + s[top--]);
 		}
 		}
 	static void display()
 	{ 
 		if(top==-1) {
 			System.out.println("Stack Empty");
 		}
 		else
 		{
 			for (int i=top;i>=0;--i) {
 				System.out.println(s[i]);
 			}
 		}
 		}
}

public class Q4_stack {
	public static void main(String[] args) {
		stack s1=new stack(5);
		s1.Push();
		s1.Push();
		s1.display();
		s1.Pop();
		
	}

	}

