class ArmstrongNumber1 
{
	public static void main(String[] args) 
	{
		int num=407,sum=0;  //0,1,153, 370, 371, 407
		int temp=num;
		while(num>0){
			int rem=num%10;
			int cube=rem*rem*rem;
			sum=sum+cube;
			num=num/10;
		}
		if(sum==temp)
			System.out.println(temp+" its a armstrong");
		else
			System.out.println(temp+" its not armstrong");

	}
}
