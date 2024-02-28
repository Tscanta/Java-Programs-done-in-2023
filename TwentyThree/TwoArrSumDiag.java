package TwentyThree;

//Two dimensional array sum of diagonal
import java.util.*;
class TwoArrSumDiag
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sumR=0;
        int sumL=0;
        System.out.println("Enter the range");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println(" ");
        System.out.println("Enter the elements in the "+n+" x "+n+" matrix one by one");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("The matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Right diagonal:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j==n-1)
                    System.out.print(a[i][j]+" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("The Left diagonal:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    System.out.print(a[i][j]+" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("The Intersection of diagonal:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i+j==n-1||i==j)
                    System.out.print(a[i][j]+" ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                    sumL += a[i][j];
                if(i+j==n-1)
                    sumR += a[i][j];
            }
        }
        System.out.println("The sum of right diagonal: "+sumR);
        System.out.println("The sum of left diagonal: "+sumL);
        System.out.println("The sum of intersection: "+(sumL+sumR));
    }
}