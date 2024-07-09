import java.util.Scanner;
//Question 2 create  two stack using single array
public class TwoStack {
	int[] arr;
    int top1, top2;

    public TwoStack(int n) {
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }
    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }
    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }
    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
    public int pop2() {
        if (top2 < arr.length) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
    public void showStacks() {
        System.out.println("Stack 1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Stack 2: ");
        for (int i = top2 ; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		TwoStack ts=new TwoStack(size);
		System.out.println("enter to stack1:");
		int input=sc.nextInt();
		ts.push1(input);
		System.out.println("enter to stack1:");
		input=sc.nextInt();
		ts.push1(input);
		System.out.println("enter to stack2:");
		input=sc.nextInt();
		ts.push2(input);
		System.out.println("enter to stack2:");
		input=sc.nextInt();
		ts.push2(input);
		ts.showStacks();
		
		System.out.println("pop from stack1:");
		ts.pop1();
		System.out.println("pop from stack2:");
		ts.pop2();
		ts.showStacks();
		
		
		}

	}


