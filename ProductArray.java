import java.util.Scanner;
public class ProductArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		int n=sc.nextInt();
		int prod=1;
		int[]arr=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
			{
			   prod*=arr[i];
			}
		System.out.println("The product of an array is: "+prod);
	}

}
