public class FrstNonRepeatingChar {

	public static void main(String[] args) {
		String str="aabbcdde";
		char[]ch=str.toCharArray();
		LinkedHashMap<Character,Integer>map=new LinkedHashMap(); 
		for(Character c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
				map.put(c,1);
		}
		Set<Character>keys=map.keySet();
		for(Character character:keys)
		{
			if(map.get(character)==1)
			{
				System.out.println("The first non repeating character is: "+character);
				break;
			}
		}

	}

}