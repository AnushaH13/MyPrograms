import java.util.Arrays;
public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {1,5,3,7,0,4,3,2};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			if(arr[j]<arr[i])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
