import java.util.Scanner;
public class AutomorphicNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int sqrt=num*num;
		boolean flag=isAutomorphic(num,sqrt);
		if(flag==false)
		{
			System.out.println(num+" is not Automorphic number");
		}
		else
		{
			System.out.println(num+" is a Automorphic number");
		}
	}
		public static boolean isAutomorphic(int num,int sqrt)
		{
			while(num>0)
			{
				if(num%10 != sqrt%10)
					return false;
				num=num/10;
				sqrt=sqrt/10;
			}
			return true;
		}

	}