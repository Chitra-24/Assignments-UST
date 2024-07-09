import java.util.Scanner;
public class sum_of_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=num1+num2;
		System.out.println("The sum of two numbers is: "+ result);
		sc.close();
	}

}
