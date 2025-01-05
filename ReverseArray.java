import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements in array: ");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before reversing");
		System.out.println(Arrays.toString(arr));
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("After reversing");
		System.out.println(Arrays.toString(arr));

	}

}
