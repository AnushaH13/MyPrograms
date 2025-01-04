import java.util.Scanner;
public class Swap2Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value for a: ");
		int a=sc.nextInt();
		System.out.print("Enter a value for b: ");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping");
		System.out.println("The values of a is: "+a);
		System.out.println("The values of b is: "+b);

	}

}