package TwentyThree;

//ARMSTRONG NUMBER
import java.util.*;
class ArmstrongNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int n=a;
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum += Math.pow(d,3);
            n=n/10;
        }
        if(sum==a)
                System.out.println("Yes, it is an armstrong number");
            else
                System.out.println("No,it is not an armstrong number");
    }
}   