package TwentyThree;

//A program to print every integer between 1 and n divisible by m, and also reporting the number that is divisible by m even or odd
import java.util.*;
class EvenOddDivisor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
        int num=0;
        System.out.println("Enter the divisor");
        int m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%m==0)
            {
                num=i;
                System.out.println(num);
                if(num%2==0)
                {
                    System.out.println("It is even");
                }
                else
                {
                    System.out.println("It is odd");
                }
            }
        }
    }
}