import java.util.*;
public class FilterChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String target=sc.nextLine();
		String reference=sc.nextLine();
		String result=removeCharacters(target,reference);
		System.out.println("output "+result);
	}
	public static String removeCharacters(String target,String reference)
	{
		StringBuilder result=new StringBuilder();
		for(char c:target.toCharArray()) 
		{
			if(!reference.contains(String.valueOf(c)))
			{
				result.append(c);
			}
		}
		return result.toString();
	}

}
