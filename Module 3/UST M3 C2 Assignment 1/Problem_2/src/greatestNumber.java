import java.util.Scanner;
public class greatestNumber {
	static void greatNum(int a,int b,int c) {
		if((a>b) && (a>c))
			System.out.println("Greatest number is "+a);
		else if((b>a) && (b>c))
			System.out.println("Greatest number is "+b);
		else
			System.out.println("Greatest number is "+c);
	}
	public static void main(String[] args) {
		greatestNumber gn=new greatestNumber();
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter the values of x y z");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		gn.greatNum(x,y,z);
		sc.close();

	}

}
