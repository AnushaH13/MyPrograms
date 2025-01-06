import java.util.Arrays;
public class Merge2ArraySort {

	public static void main(String[] args) {
		int arr1[]= {1,3,5};
		int arr2[]= {2,4,6,7};
		int arr[]=new int[arr1.length+arr2.length];
		int index=0;
		int i=0,j=0;
		while(i< arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr[index]=arr1[i];
				i++;
				index++;
			}
			else
			{
				arr[index]=arr2[j];
				j++;
				index++;
			}
		}
			while(i<arr1.length)
			{
				arr[index]=arr1[i];
				index++;
				i++;
			}
			while(j<arr2.length)
			{
				arr[index]=arr2[j];
				index++;
				j++;
			}
		System.out.println("merging of arr1 and arr2 are:");
		System.out.println(Arrays.toString(arr));
	}

}
