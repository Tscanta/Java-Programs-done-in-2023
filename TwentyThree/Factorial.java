package TwentyThree;

// Sum of factorial series 1 + 1/1! + 1/2! + 1/3!...
import java.util.*;
public class Factorial
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range");
        int n = sc.nextInt();
        double sum=0.0;
        for (int i = 1; i <= n;i++) 
        {
            long f = 1;
            for (int j = 1; j <= i; j++) 
            {
                f *= j;
            }
            sum += (1.0 / f);
        }
        System.out.println("Sum=" + sum);
    }
}