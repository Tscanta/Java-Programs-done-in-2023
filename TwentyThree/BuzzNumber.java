package TwentyThree;

//BUZZ NUMBER
import java.util.*;
class BuzzNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%10==7&&n%7==0)
            System.out.println("Yes,it is a buzz number");
        else
            System.out.println("No,it is not a buzz number");
    }
}
