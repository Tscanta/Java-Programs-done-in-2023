package TwentyFour;

//Prime Adam
import java.util.*;
class PrimeAdam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("CHECKING IF A NUMBER IS PRIMEADAM OR NOT");
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int nsum=n*n;
        System.out.println("The square of your number is: " + nsum);
        int sum=0;
        int numsum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%n==0&&n%i!=0)
            {
                while(n>0)
                {
                    int d=n%10;
                    sum=sum*10+d;
                    n=n/10;
                }
                numsum=sum*sum;
                System.out.println("The square of the reverse of your number is: " +numsum);
                int sum2=0;
                while(numsum>0)
                {
                    int r=numsum%10;
                    sum2=sum2*10+r;
                    numsum=numsum/10;
                }
                if(nsum==sum2)
                {
                    System.out.println("It is an PRIME ADAM number");
                }
                else
                {
                    System.out.println("It is NOT an PRIME ADAM number");
                }
            }
        }
    }
}