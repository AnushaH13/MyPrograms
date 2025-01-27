import java.util.*;
public class VibgyorOccurrence {
		    
		    public static int maxVibgyorOccurrences(String str) {
		    	Scanner sc=new Scanner(System.in);
		        HashMap<Character, Integer> charCount = new HashMap<>();
		        for (char c : str.toCharArray()) {
		            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		        }
		        String word = sc.nextLine();
		        int minOccurrences = Integer.MAX_VALUE;
		        for (char c : word.toCharArray()) {
		            if (!charCount.containsKey(c)) {
		                return 0;
		            }
		            minOccurrences = Math.min(minOccurrences, charCount.get(c));
		        }
		        return minOccurrences;
		    }
		    public static void main(String[] args) {
		        String input = "boiirvbvyirg";
		        int result = maxVibgyorOccurrences(input);
		        System.out.println("Maximum number of complete occurrences of 'vibgyor': " + result);
		    }
		}
