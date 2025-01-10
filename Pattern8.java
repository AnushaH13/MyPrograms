
public class Pattern8 {

	public static void main(String[] args) {
		int space=5,star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");	
			}
			star+=2*1;
			space--;
			System.out.println();
		}
	}
}
