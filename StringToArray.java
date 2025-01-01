import java.util.ArrayList;

public class StringToArray {

	public static void main(String[] args) {
		String str="Programming is very fun!";
		ArrayList<String>al=new ArrayList();
		String word="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				word+=str.charAt(i);
			}
			else
			{
				al.add(word);
				word="";
			}
		}
		 if (!word.isEmpty()) 
		 {
	            al.add(word);
	     }
		System.out.println(al);
	}
}