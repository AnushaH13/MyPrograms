import java.util.HashSet;
public class ArrayDuplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,4,3,2,5,4,1,6,6};
		HashSet<Integer>hs=new HashSet();
		/*for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}*/
		for(int i:arr)
		{
			hs.add(i);
		}
		System.out.println(hs);

	}

}
