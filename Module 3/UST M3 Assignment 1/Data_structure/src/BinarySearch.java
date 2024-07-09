import java.util.Scanner;
public class BinarySearch {
	int Binsearch(int arr[],int key,int low,int high) {
		if(low<=high) {
		int mid=(low+high)/2;
		if(key==arr[mid]) {
			System.out.println("Key found at index: ");
			return mid;
		}
		else if(key<arr[mid]) {
			return Binsearch(arr,key,low,mid-1);
		}
		else 
			return Binsearch(arr,key,mid+1,high);
		}
		return -1;
	}
	public static void main(String[] args) {
		BinarySearch s1=new BinarySearch();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter sorted array");
		int array[]= new int[size];
		for (int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("enter the num you want to search:");
		int num=sc.nextInt();
		int res=s1.Binsearch(array,num,0,size-1);
		System.out.println(res);
	}

}
