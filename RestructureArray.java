import java.util.*;
public class RestructureArray {

	public static void main(String[] args) {
		int arr[]= {1,0,-1,1,-1,0};
		int temp[]=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				temp[index++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				temp[index++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==-1)
			{
				temp[index++]=arr[i];
			}
		}
		System.out.println("Array before: "+Arrays.toString(arr));
		System.out.println("Array After: "+Arrays.toString(temp));
	}

}
