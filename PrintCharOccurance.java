import java.util.*;
public class PrintCharOccurance {

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
		Set <Map.Entry<Character,Integer>>set=map.entrySet();
		for(Map.Entry<Character,Integer> entry:set )
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" occures"+entry.getValue()+" times");
			}
		}
	}

}
