
public class Pattern10 {

	public static void main(String[] args) {
		int space=0;
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(' ');
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
		}

	}

}
