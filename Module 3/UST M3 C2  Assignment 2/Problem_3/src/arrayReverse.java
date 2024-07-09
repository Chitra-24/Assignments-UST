import java.util.Scanner;
public class arrayReverse {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array items");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		for(int i=n-1;i>=0;i--) {					
			System.out.print(arr[i]+"\t");
		}
		sc.close();

	}

}
