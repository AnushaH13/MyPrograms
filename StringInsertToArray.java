public class StringInsertToArray {

	public static void main(String[] args) {
		String[]str= {"Java","is","fav","lang","ok?"};
		int position=3;
		String element="my";
		if(position>=1 && position <= str.length+1)
		{
			String newArr[]=new String[str.length+1];
			for(int i=0;i<=position-1;i++)
			{
				newArr[i]=str[i];
			}
			newArr[position-1]=element;
			for(int i=position;i<=str.length;i++)
			{
				newArr[i]=str[i-1];
			}
			for(int i=0;i<newArr.length;i++)
			{
				System.out.println(newArr[i]);
			}
		}
	}

}