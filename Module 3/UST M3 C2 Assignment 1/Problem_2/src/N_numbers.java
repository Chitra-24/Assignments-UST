import java.util.Scanner;
public class N_numbers {
	static int sumOfNum(int x) {
		int sum=0;
		for(int i=1;i<=x;i++) {
			sum+=i;
		}
		return sum;
	}
	static int div(int x) {
		int sum1=0;
		int num=x/2;
		for(int i=1;i<=num;i++) {
			if(x%i==0)
				sum1+=i;
		}
		return sum1;
	}
	public static void main(String[] args) {
		N_numbers obj=new N_numbers();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value");
		int n=sc.nextInt();
		int res1=obj.sumOfNum(n);
		int res2=obj.div(n);
		System.out.println("the sum of n numbers is "+ res1);
		System.out.println("the sum of divisors " + res2);
		sc.close();
	}

}
