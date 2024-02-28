package TwentyThree;

//A program to enter a number greater than 100 and display the sum of cubes of the digits 
import java.util.*;
class SumCube
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number >=100");
        int n=sc.nextInt();
        int sum=0;
        if(n>100)
        {
            while(n>0)
            {
                int d=n%10;
                n /= 10;
                sum += Math.pow(d,3);
            }
            System.out.println(sum);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}