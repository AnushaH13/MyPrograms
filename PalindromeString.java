
public class PalindromeString {

	public static void main(String[] args) {
		String str="annaa";
		String newString="";
		for(int i=str.length()-1;i>=0;i--)
		{
			newString=newString+str.charAt(i);
		}
		if(str.equals(newString))
		{
			System.out.println("it's palindrome");
		}
		else
		{
			System.out.println("it's not palindrome");
		}

	}

}
