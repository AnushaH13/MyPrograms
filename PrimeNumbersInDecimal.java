import java.util.*;
public class PrimeNumbersInDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Set<Integer>primes=new TreeSet<>();
		for(int i=1;i<=input.length();i++)
		{
			generateNumbers(input,i, "",new boolean[input.length()],primes);
			
		}
		if(primes.isEmpty())
		{
			System.out.println("no prime number found");
		}
		else
		{
			for(int prime:primes)
			{
				System.out.print(prime+" ");
			}
		}
	}
	private static void generateNumbers(String input,int length,String current,boolean[]used,Set<Integer>primes)
	{
		if(current.length()==length)
		{
			int number=Integer.parseInt(current);
			if(isPrime(number))
			{
				primes.add(number);
			}
			return;
		}
		for(int i=0;i<input.length();i++)
		{
			if(!used[i]) {
				used[i]=true;
				generateNumbers(input,length,current+input.charAt(i),used,primes);
				used[i]=false;
			}
		}
	}
	private static boolean isPrime(int num)
	{
		if(num<2)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

}
