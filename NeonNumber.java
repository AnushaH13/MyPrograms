import java.util.*;
class NeonNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum=0,rem=0;
        int sqrt=num*num;
        while(sqrt>0)
        {
            rem=sqrt%10;
            sum=sum+rem;
            sqrt=sqrt/10;
        }
        if(sum==num)
        {
            System.out.println(num+" is a neon number");
        }
        else
        {
            System.out.println(num+" is not a neon number");
        }
        
    }
}