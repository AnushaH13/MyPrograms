import java.util.*;
public class ArrayRotation {

	public static void main(String[] args) {
		int arr[]= {10,12,14,16,18};
		int index=3;
		int newArr[]=new int[arr.length];
		int newIndex=0;
		for(int i=index;i<arr.length;i++)
		{
			newArr[newIndex++]=arr[i];
		}
		for(int i=0;i<index;i++)
		{
			newArr[newIndex++]=arr[i];
		}
		System.out.println("Array before rotating "+Arrays.toString(arr));
		System.out.println("Array After rotating "+Arrays.toString(newArr));

	}

}
