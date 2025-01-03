public class ParenthesesChecker {

	public static void main(String[] args) {
		String paranthses="{[()]}";
		boolean result=checkParantheses(paranthses);
		if(result)
		{
			System.out.println("parantheses are balanced");
		}
		else
		{
			System.out.println("parantheses are not balanced");
		}
	}
	public static boolean checkParantheses(String parantheses)
	{
		Stack<Character>stack=new Stack<Character>();
		for(char ch:parantheses.toCharArray())
		{
			if(ch=='{'||ch=='['||ch=='(')
			{
				stack.push(ch);
			}
			else if(ch==')'||ch==']'||ch=='}')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				else 
				{
				char popped=stack.pop();
				if((ch == ')' && popped != '(' ) ||
				   (ch == ']' && popped != '[' ) ||
				   (ch == '}' && popped != '{' ))
				{
					return false;
				}
				}  
			}
			
		}
		return stack.isEmpty();
	}

}