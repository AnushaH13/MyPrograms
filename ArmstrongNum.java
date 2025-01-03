import java.util.Scanner;
public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0,cube=0,rem=0;
		while(num>0)
		{
			rem=num%10;
			cube=rem*rem*rem;
			sum=sum+cube;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" it's an Armstrong number");
		}
		else
		{
			System.out.println(temp+" it's not an Armstrong number");
		}

	}

}