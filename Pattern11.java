public class Pattern11 {

	public static void main(String[] args) {
		int space=0;
		for(int i=5;i>=1;i--)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(' ');
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			space++;
		}

	}

}
