public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		String str="aabbscydgab";
		char []ch=str.toCharArray();
		String subString="";
		//char c=str.charAt(str.length()-1);
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]!=ch[i+1])
			{
				subString+=ch[i];
			}
		}
		//System.out.println(subString+c);
		System.out.println(subString);
	}

}