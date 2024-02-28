package TwentyThree;

//NIVEN NUMBER
import java.util.*;
class NivenNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(num!=0)
        {
            int d=num%10;
            num /= 10;
            sum +=d;
        }
        if(sum!=0&&n%sum==0)
            System.out.println("Yes, it is a niven number");
        else
            System.out.println("No, it is not a niven number");
    }
}