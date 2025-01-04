import java.util.Scanner;
public class FibonacciTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int num=sc.nextInt();
		int a,b,c;
		for(int i=1;i<=num;i++)
		{
			a=0;
			b=1;
			System.out.print(b+" ");
			for(int j=1;j<i;j++)
			{
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			System.out.println();
		}
	}

}