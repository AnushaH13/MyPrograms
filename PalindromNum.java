import java.util.*;
public class PalindromNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int rem=0,rev=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is a palindrom number");
		}
		else
		{
			System.out.println(temp+" is not a palindrom number");
		}	

	}

}
