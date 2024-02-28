package TwentyThree;

//A program to read a number and produce its reverse
import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            sum= sum * 10+d;
            n /= 10;
        }
        System.out.println(sum);
    }
}