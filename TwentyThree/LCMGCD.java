package TwentyThree;

//LCM AND GCD
import java.util.*;
class LCMGCD
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int GCD=0;int LCM=0;
        for(int i=1;i<=a&&i<=b;++i)
        {
            if(a%i==0&&b%i==0)
            GCD=i;
        }
        LCM=(a*b)/GCD;
        System.out.println("LCM= "+LCM);
        System.out.println("GCD= "+GCD);
    }
}