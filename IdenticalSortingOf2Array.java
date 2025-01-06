import java.util.*;
public class IdenticalSortingOf2Array {

	public static void main(String[] args) {
		int []arr1= {10,20,30,40,50,60,70};
		int []arr2= {20,10,30,50,40,60};
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr2[j]>arr2[j+1])
				{
					int temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
		boolean flag=true;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1.length != arr2.length || arr1[i]!=arr2[i])
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("Both are Identical");
		}
		else
		{
			System.out.println("Both are not Identical");
		}
		

	}

}
