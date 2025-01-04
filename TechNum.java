import java.util.Scanner;
public class TechNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int temp=num;
		int lstHalf=num%100;
		int frstHalf=num/100;
		int sum=frstHalf+lstHalf;
		int sqrt=sum*sum;
		if(sqrt==temp)
		{
			System.out.println(temp+" is a Tech number");
		}
		else
		{
			System.out.println(temp+" is not a Tech number");
		}
	}

}