import java.util.Scanner;
public class MaximumElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the number of elements in the array: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" element to the array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.print("The Maximum element in the array is: "+max);
	}

}
