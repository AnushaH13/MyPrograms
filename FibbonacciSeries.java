import java.util.*;
public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
		int frstTerm=0;
		int scndTerm=1;
		int thrdTerm;
		System.out.println(frstTerm);
		System.out.println(scndTerm);
		for(int i=3;i<=num;i++)
		{
			thrdTerm=frstTerm+scndTerm;
			System.out.println(thrdTerm);
			frstTerm=scndTerm;
			scndTerm=thrdTerm;
		}

	}

}