import java.util.Scanner;
public class primeNum {
	public static void prime(int x) {
		int flag=0;
		if(x<2)
			System.out.println("Not Prime num");
		else {
			int n=x/2;
			for(int i=2;i<=n;i++) {
				if(x%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.printf("the number is %d prime\n",x);
			else
				System.out.printf("the number is %d not prime\n",x);
		}
	}
	public static void main(String[] args) {
		primeNum pn=new primeNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		pn.prime(num);

	}

}
