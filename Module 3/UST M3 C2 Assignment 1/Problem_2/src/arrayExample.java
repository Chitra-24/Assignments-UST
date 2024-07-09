import java.util.Scanner;
public class arrayExample {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array items");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0)					//even cells like index 1 and index 3
				System.out.print(arr[i]+"\t");
		}

	}

}
