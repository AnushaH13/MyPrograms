import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num =sc.nextInt();
		int count=(countDigits(num));
		System.out.println("Number of Digits is: "+count);
		
	}
	public static int countDigits(int num)
	{
		if(num==0)
			return 0;
		else
			return 1 + countDigits(num/10);
	}

}