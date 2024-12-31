import java.util.*;
public class PrintCharOccurance1 {

	public static void main(String[] args) {
		String s="Programming is funn!";
		char ch[]=s.toLowerCase().toCharArray();
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
				map.put(c,1);
		}
		System.out.println(map);
		Set<Character>key=map.keySet();
		for(Character character:key)
		{
			if(map.get(character)>1)
			{
				System.out.println(character);
			}
		}
	}

}
