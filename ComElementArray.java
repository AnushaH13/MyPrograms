import java.util.*;
public class ComElementArray {

	public static void main(String[] args) {
		Integer[]arr1= {1,2,3,9,7};
		Integer[]arr2= {4,1,2,10,15};
		Integer[]arr3= {5,1,2,4,10};
		List<Integer>list1=Arrays.asList(arr1);
		List<Integer>list2=Arrays.asList(arr2);
		List<Integer>list3=Arrays.asList(arr3);
		
		HashSet<Integer>hs=new HashSet<>(list1);
		hs.addAll(list2);
		hs.addAll(list3);
		ArrayList<Integer>finalList=new ArrayList<>();
		
		for(Integer i:hs)
		{
			if((list1.contains(i)&&list2.contains(i)) || 
			   (list2.contains(i) && list3.contains(i)) ||
			   (list3.contains(i) && list1.contains(i)))
			{
				finalList.add(i);
			}
			   
		}
		System.out.println(finalList);

	}

}
