
public class MissingElement {

	public static void main(String[] args) {
		int arr[]= {20,40,80,100};
		int sum1=0,sum2=0,sum=0;
		for(int i=20;i<=100;i+=20)
		{
			sum1=sum1+i;
		}
		for(int i=0;i<arr.length;i++)
		{
			sum2=sum2+arr[i];
		}
		sum=sum1-sum2;
		System.out.print("Missing element is: "+sum);
	}

}
