class arrayProd 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		int prod=1;
		for(int i=0;i<a.length;i++)
		{
			prod=prod*a[i];
		}
		System.out.println(prod);
	}
}
