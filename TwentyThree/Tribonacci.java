package TwentyThree;

//Tribonacci Series
import java.util.*;
class Tribonacci
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       long first=0;long second=1;long third=2;
       long fourth;
       System.out.println("Enter the range");
       int n=sc.nextInt();
       System.out.println("Tribonacci Series");
       System.out.print(first+" "+second+" "+third);
       for(int i=2;i<n;i++)
       {
           fourth=first+second+third;
           System.out.print(" "+fourth);
           first=second;
           second=third;
           third=fourth;
       }
   }
}