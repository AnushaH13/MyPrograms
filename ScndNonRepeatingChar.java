import java.util.LinkedHashMap;
import java.util.Set;
public class ScndNonRepeatingChar {

	public static void main(String[] args) {
		String str="aabbcddefffg";
		char[]ch=str.toCharArray();
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		for(Character c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		Set<Character>keys=map.keySet();
		int count=0;
		for(Character character:keys)
		{
			if(map.get(character)==1)
			{
				count++;
			}
		    if(count==2)
		    {
			System.out.println("The second non repeating character in a string is: "+character);
			break;
		    }
		}

	}

}