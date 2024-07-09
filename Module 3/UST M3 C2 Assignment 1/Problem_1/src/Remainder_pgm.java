import java.util.Scanner;
public class Remainder_pgm {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b;
		int i;
		System.out.println("Enter the value of a and b: ");
		a=scan.nextInt();
		b=scan.nextInt();
		for(i=1;i<(a/2);i++) {
			if((b*i)>a)
				break;
		}
		int mul=b*(i-1);
		int rem=a-mul;
		System.out.println("remainder is "+rem);
		scan.close();
	}

}
