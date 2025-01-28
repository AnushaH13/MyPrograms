
public class ReverseSentanceWithoutReversingWords {

	public static void main(String[] args) {
		String s="this is reversed sentance";
		String word="";
		String newSentence="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				word +=s.charAt(i);
			}
			else
			{
				newSentence =word+ " "+newSentence;
				word="";
			}
		}
		newSentence=word+" "+newSentence;
		System.out.println(newSentence);

	}

}
