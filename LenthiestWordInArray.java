public class LenthiestWordInArray {

	public static void main(String[] args) { 
	String[]words= {"Tarun","Arun gowda","meghana"};
		String longestWord=findLongestWords(words);
		System.out.println("Longest word in the array:"+longestWord);
	}
	public static String findLongestWords(String[]words)
	{
		String longest=words[0];
		for(int i=1;i<words.length;i++)
		{
			if(compareLength(words[i],longest)>0)
			{
				longest=words[i];
			}
		}
		return longest;
	}
	public static int compareLength(String word1,String word2)
	{
		int len1=0,len2=0;
		for(char c:word1.toCharArray()) {
			len1++;
		}
		for(char c:word2.toCharArray()) {
			len2++;
		}
		if(len1>len2)
		{
			return len1;
		}
		else
			return len1-len2;
	}

}
