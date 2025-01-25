import java.util.*;
public class SumOf_even_odd {

	public static void main(String[] args) {
	List<Integer>numbers =Arrays.asList(1,2,3,4,5,6);
	int sum_even=0;
	int sum_odd=0;
	for(int num :numbers)
	{
		if(num % 2==0)
		{
			sum_even=num+sum_even;
		}
		else
		{
			sum_odd=sum_odd+num;
		}
		
	}
	System.out.println("Sum of even numbers: "+sum_even);
	System.out.println("Sum of odd numbers: "+sum_odd);

	}

}
