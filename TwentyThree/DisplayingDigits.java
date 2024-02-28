package TwentyThree;

//A program to enter a number >100 from the keyboard and display each and every digit
import java.util.*;
class DisplayingDigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number greater than hundred");
        int n=sc.nextInt();
        if(n>100)
            while(n>0)
            {
                int d=n%10;
                System.out.println(d);
                n=n/10;
            }
            else
                System.out.println("Please enter a number greater than hundred");
    }
}