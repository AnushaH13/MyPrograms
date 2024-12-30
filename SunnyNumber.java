import java.util.Scanner;
public class SunnyNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=isSunny(num);
		if(flag)
			System.out.println(num+" is a Suuny number");
		else
			System.out.println(num+" is not a Sunny number");	

	}
	public static boolean isSunny(int num)
	{
		int newNum=num+1;
		int square=1;
		int count=1;
		while(square<num)
		{
			count++;
			square=count*count;
		}
		if(square==newNum)
			return true;
		else
			return false;
	}

}