class BinarySearch 
{
	public static void main(String[] args) 
	{
		int a[]={10,20,30,40,50};
		int start=0;
		int end=a.length-1;
		int key=20;
		while(start<=end)
		{
			int mid=(start+end)/2;
		if(a[mid]==key)
		{ 
			System.out.println("Element found at index "+mid);
			break;
		}
		else if(key<a[mid])
		{
			end=mid-1;
		}
		else if(key>a[mid])
		{
			start=mid+1;
		}
	
		}
        
	}
}
