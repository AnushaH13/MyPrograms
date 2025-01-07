import java.util.Arrays;
public class CopyArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int temp[]= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[i];
		}
		System.out.println("Actual array: "+Arrays.toString(arr));
		System.out.println("Copy array: "+Arrays.toString(temp));
	}

}
