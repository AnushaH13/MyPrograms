import java.util.*;
public class ArrayRotation1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int index=3;
		int[]newArr= new int[arr.length];
		int i=0;
		for(int j=arr.length-index;j<arr.length;j++)
		{
			newArr[i++]=arr[j];
		}
		i=0;
		while(index<arr.length)
		{
			newArr[index++]=arr[i++];
		}
		System.out.println("Array before rotation: "+Arrays.toString(arr));
		System.out.println("Array After rotation: "+Arrays.toString(newArr));

	}

}
