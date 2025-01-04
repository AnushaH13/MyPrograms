public class CountWordsInSentance {

	public static void main(String[] args) {
		String sen="This is a java program";
		int count=1;
		for(int i=0;i<sen.length();i++)
		{
			if(sen.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("Number of words in a sentance is: "+count);

	}

}