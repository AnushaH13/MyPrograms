import java.util.*;
public class ModifySentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		if(input.length()>1)
		{
			String modifyString="do not "+input;
			System.out.println(modifyString);
		}
		else
		{
			System.out.println("Invalid input: sentance must be greater than 1");
		}

	}

}
