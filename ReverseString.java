
public class ReverseString {

	public static void main(String[] args) {
		String str="name";
		String newString="";
		for(int i=str.length()-1;i>=0;i--)
		{
			newString=newString+str.charAt(i);
			
		}
		System.out.println(newString);
	}

}
