import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to reverse: ");
		int num=sc.nextInt();
		int rem=0,rev=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("reverse of "+temp+" is "+rev);

	}

}
