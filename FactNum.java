import java.util.Scanner;
public class FactNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		double num=sc.nextDouble();
		double fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
			
		}
		System.out.println("The factorial of an "+num+" is:"+fact);
	}

}