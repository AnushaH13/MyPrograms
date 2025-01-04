import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to covert: ");
		int num=sc.nextInt();
		int arr[]=new int[10];
		int i=0;
		while(num>0)
		{
			arr[i]=num%2;
			num=num/2;
			i++;
		}
		System.out.print("Binary of the given number: ");
		for(i=i-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}

	}

}