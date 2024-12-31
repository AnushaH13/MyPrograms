public class Anagram {

	public static void main(String[] args) {
		String s1="Race";
		String s2="Care";
		char ch1[]=s1.toLowerCase().toCharArray();
		char ch2[]=s2.toLowerCase().toCharArray();
		System.out.println("strings before sorting");
		System.out.println(ch1);
		System.out.println(ch2);
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println("strings after sorting");
		System.out.println(ch1);
		System.out.println(ch2);
		boolean flag = Arrays.equals(ch1,ch2);
	
		if(flag)
			System.out.println("the strings are Anagram");
		else
			System.out.println("the strings are not an anagram");

	}

}