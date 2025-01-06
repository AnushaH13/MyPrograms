import java.util.Arrays;
public class SelectionSort1 {

	public static void main(String[] args) {
		int[]arr= {64, 25, 12, 22, 11};
		System.out.println("Original Array: "+Arrays.toString(arr));
	
		for(int i=0;i<arr.length;i++)
		{
			int select=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[select])
				{
					int temp=arr[select];
					arr[select]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array: "+Arrays.toString(arr));

	}

}
