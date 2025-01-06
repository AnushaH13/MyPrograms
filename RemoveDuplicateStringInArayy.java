import java.util.HashSet;
public class RemoveDuplicateStringInArayy {

	public static void main(String[] args) {
		String[]arr= {"java","python","c++","java","ruby","python"};
		HashSet<String>hs=new HashSet<String>();
		for(String i:arr)
		{
			hs.add(i);
		}
		System.out.println(hs);		
	}

}
