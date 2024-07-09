import java.util.Scanner;
public class arrayAverage {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array items");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int total=0;
		for(int i=0;i<arr.length;i++) {	
			total+=arr[i];
		}
		float avg=total/arr.length;
		System.out.println("Average of array elements is "+ avg);
		sc.close();

	}

}
