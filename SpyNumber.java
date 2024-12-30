import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int sum=0,prod=1;
	int temp=num;
	while(temp>0)
	{
		int rem=temp%10;
		sum=sum+rem;
		prod=prod*rem;
		temp=temp/10;
	}
	if(sum==prod)
	{
		System.out.println(num+" is a Spy number");
	}
	else
	{
		System.out.println(num+" is not spy number");
	}

	}

}
