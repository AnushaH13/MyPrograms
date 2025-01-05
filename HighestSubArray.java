import java.util.Scanner;
public class HighestSubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of element in array: ");
		int n=sc.nextInt();
		System.out.println("Enter array Elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int curSum=0,maxSum=0;
		for(int i=0;i<arr.length-1;i++)
		{
				curSum=arr[i]+arr[i+1];
			if(curSum>maxSum)
			{
				maxSum=curSum;
			}
		}
		System.out.println(maxSum);
		
	}

}
